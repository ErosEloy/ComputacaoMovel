import java.util.Properties
import jakarta.mail.*
import jakarta.mail.internet.InternetAddress
import jakarta.mail.internet.MimeMessage

fun enviarEmail() {
    val props = Properties().apply {
        put("mail.smtp.auth", "true")
        put("mail.smtp.starttls.enable", "true")
        put("mail.smtp.host", "smtp.gmail.com")
        put("mail.smtp.port", "587")
    }

    val sessao = Session.getInstance(props, object : Authenticator() {
        override fun getPasswordAuthentication() =
            PasswordAuthentication("seuemail@gmail.com", "sua-senha-ou-app-password")
    })

    val msg = MimeMessage(sessao).apply {
        setFrom(InternetAddress("seuemail@gmail.com"))
        setRecipients(Message.RecipientType.TO, InternetAddress.parse("destinatario@exemplo.com"))
        subject = "Assunto"
        setText("Olá, este é um email enviado via Kotlin!")
    }

    Transport.send(msg)
}

fun main() {
    enviarEmail()
    println("Email enviado com sucesso!")
}
