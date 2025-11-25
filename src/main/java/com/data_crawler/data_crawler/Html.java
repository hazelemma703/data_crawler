package com.data_crawler.data_crawler;

public class Html {

    public static String getHtml(Long code) {
        return """
                <!DOCTYPE html>
                <html lang="es">
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>Verificación de Email - DeepSeek</title>
                    <style>
                        body {
                            margin: 0;
                            padding: 0;
                            font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif;
                            background-color: #f5f5f5;
                        }
                
                        .container {
                            width: 100%%;
                            border-collapse: collapse;
                            background-color: #f5f5f5;
                        }
                
                        .wrapper {
                            padding: 20px;
                        }
                
                        .email-wrapper {
                            max-width: 600px;
                            margin: 0 auto;
                            background-color: #ffffff;
                            border-radius: 8px;
                            box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
                            overflow: hidden;
                        }
                
                        .header {
                            background: linear-gradient(135deg, #1a1a2e 0%%, #16213e 100%%);
                            padding: 40px 20px;
                            text-align: center;
                        }
                
                        .header h1 {
                            margin: 0;
                            color: #ffffff;
                            font-size: 24px;
                            font-weight: 600;
                        }
                
                        .content {
                            padding: 40px 30px;
                        }
                
                        .content h2 {
                            margin: 0 0 20px 0;
                            color: #1a1a2e;
                            font-size: 20px;
                            font-weight: 600;
                            text-align: left;
                        }
                
                        .content p {
                            margin: 0 0 20px 0;
                            color: #555555;
                            font-size: 16px;
                            line-height: 1.6;
                            text-align: left;
                        }
                
                        .code-box {
                            background-color: #f0f4f8;
                            border-left: 4px solid #0066cc;
                            padding: 20px;
                            margin: 0 0 30px 0;
                            border-radius: 4px;
                            text-align: center;
                        }
                
                        .code-box p {
                            margin: 0;
                            color: #0066cc;
                            font-size: 32px;
                            font-weight: 700;
                            letter-spacing: 4px;
                            font-family: 'Courier New', monospace;
                        }
                
                        .footer {
                            background-color: #f9f9f9;
                            padding: 30px;
                            border-top: 1px solid #eeeeee;
                            text-align: center;
                        }
                
                        .footer p {
                            margin: 0 0 10px 0;
                            color: #555555;
                            font-size: 14px;
                            text-align: center;
                        }
                
                        .footer p:last-child {
                            margin: 0;
                            color: #999999;
                            font-size: 12px;
                        }
                
                        .small-text {
                            color: #888888;
                            font-size: 13px;
                            font-style: italic;
                        }
                
                        @media (max-width: 600px) {
                            .email-wrapper {
                                border-radius: 0;
                            }
                
                            .code-box p {
                                font-size: 28px;
                                letter-spacing: 2px;
                            }
                        }
                    </style>
                </head>
                <body>
                    <table role="presentation" class="container">
                        <tr>
                            <td class="wrapper">
                                <table role="presentation" class="email-wrapper">
                                    <!-- Header -->
                                    <tr>
                                        <td class="header">
                                            <h1>DeepSeek</h1>
                                        </td>
                                    </tr>
                
                                    <!-- Content -->
                                    <tr>
                                        <td class="content">
                                            <h2>Verifica tu dirección de email</h2>
                
                                            <p>Tu código de verificación es:</p>
                
                                            <!-- Code Box -->
                                            <div class="code-box">
                                                <p>%s</p>
                                            </div>
                
                                            <p>Ingresa este código en la aplicación DeepSeek para verificar tu dirección de email.</p>
                
                                            <p class="small-text">Si no solicitaste este código, puedes ignorar este email de forma segura.</p>
                                        </td>
                                    </tr>
                
                                    <!-- Footer -->
                                    <tr>
                                        <td class="footer">
                                            <p>Gracias por usar DeepSeek</p>
                                            <p>© 2025 DeepSeek. Todos los derechos reservados.</p>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                </body>
                </html>
               """.formatted(code);
    }
}
