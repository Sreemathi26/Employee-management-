package Employee;

import java.awt.EventQueue;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.awt.event.ActionEvent;

public class otp extends JFrame {
	public otp() {
	}

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_num;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					otp frame = new otp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 * @return 
	 */
	void otp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1289, 897);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CONTACT");
		lblNewLabel.setBounds(165, 144, 85, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CODE");
		lblNewLabel_1.setBounds(165, 246, 85, 16);
		contentPane.add(lblNewLabel_1);
		
		txt_num = new JTextField();
		txt_num.setBounds(314, 139, 185, 27);
		contentPane.add(txt_num);
		txt_num.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(314, 238, 185, 27);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("SEND CODE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*String myURI = "https://api.bulksms.com/v1/messages";

			    // change these values to match your own account
			    String myUsername = "subashree";
			    String myPassword = "Suba@3107";
			    Random random = new Random();
			    int min = 100000;
			    int max =9999999;
			    int otp = random.nextInt((max-min)+min);
			   String number = txt_num.getText();
			    // the details of the message we want to send
			    String myData = "{to: \""+number+"\", body: \"Your OTP is:"+otp+"\"}";

			    
			    // build the request based on the supplied settings
			    URL url;
				try {
					url = new URL(myURI);
				
			    HttpURLConnection request;
				try {
					request = (HttpURLConnection) url.openConnection();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
				      Logger.getLogger
				}
			    request.setDoOutput(true);

			    // supply the credentials
			    String authStr = myUsername + ":" + myPassword;
			    String authEncoded = Base64.getEncoder().encodeToString(authStr.getBytes());
			    request.setRequestProperty("Authorization", "Basic " + authEncoded);

			    // we want to use HTTP POST
			    try {
					request.setRequestMethod("POST");
				} catch (ProtocolException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			    request.setRequestProperty( "Content-Type", "application/json");

			    // write the data to the request
			    OutputStreamWriter out = null;
				try {
					out = new OutputStreamWriter(request.getOutputStream());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			    try {
					out.write(myData);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			    try {
					out.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			    // try ... catch to handle errors nicely
			    try {
			      // make the call to the API
			      InputStream response = request.getInputStream();
			      BufferedReader in = new BufferedReader(new InputStreamReader(response));
			      String replyText;
			      while ((replyText = in.readLine()) != null) {
			        System.out.println(replyText);
			      }
			      in.close();
			    } catch (IOException ex) {
			      System.out.println("An error occurred:" + ex.getMessage());
			      BufferedReader in = new BufferedReader(new InputStreamReader(request.getErrorStream()));
			      // print the detail that comes with the error
			      String replyText;
			      try {
					while ((replyText = in.readLine()) != null) {
					    System.out.println(replyText);
					  }
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			      try {
					in.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			    }
			    request.disconnect();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			  }*/
				/*String myURI = "https://api.bulksms.com/v1/messages";

				// change these values to match your own account
				String myUsername = "subashree";
				String myPassword = "Suba@3107";
				 Random random = new Random();
				    int min = 100000;
				    int max =9999999;
				    int otp = random.nextInt((max-min)+min);
				   String number = txt_num.getText();
				    // the details of the message we want to send
				    String myData = "{to: \""+number+"\", body: \"Your OTP is:"+otp+"\"}";

				// the details of the message we want to send
				
				// build the request based on the supplied settings
				URL url;
				try {
					url = new URL(myURI);
				
				HttpURLConnection request;
				try {
					request = (HttpURLConnection) url.openConnection();
					request.setDoOutput(true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				request.setDoOutput(true);

				// supply the credentials
				String authStr = myUsername + ":" + myPassword;
				String authEncoded = Base64.getEncoder().encodeToString(authStr.getBytes());
				request.setRequestProperty("Authorization", "Basic " + authEncoded);

				// we want to use HTTP POST
				try {
					request.setRequestMethod("POST");
				} catch (ProtocolException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				request.setRequestProperty( "Content-Type", "application/json");

				// write the data to the request
				OutputStreamWriter out = new OutputStreamWriter(request.getOutputStream());
				try {
					out.write(myData);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					out.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				// try ... catch to handle errors nicely
				try {
				  // make the call to the API
				  InputStream response = request.getInputStream();
				  BufferedReader in = new BufferedReader(new InputStreamReader(response));
				  String replyText;
				  while ((replyText = in.readLine()) != null) {
				    System.out.println(replyText);
				  }
				  in.close();
				} catch (IOException ex) {
				  System.out.println("An error occurred:" + ex.getMessage());
				  BufferedReader in = new BufferedReader(new InputStreamReader(request.getErrorStream()));
				  // print the detail that comes with the error
				  String replyText;
				  try {
					while ((replyText = in.readLine()) != null) {
					    System.out.println(replyText);
					  }
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  try {
					in.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
				request.disconnect();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				}
			
		});*/
		btnNewButton.setBounds(603, 133, 143, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("VERIFY");
		btnNewButton_1.setBounds(603, 239, 131, 27);
		contentPane.add(btnNewButton_1);
	
}
	public class SendMessageAction implements ActionListener {
		  private JTextField txt_num;

		    public SendMessageAction(JTextField txt_num) {
		        this.txt_num = txt_num;
		    }

		    @Override
		    public void actionPerformed(ActionEvent e) {
		        String myURI = "https://api.bulksms.com/v1/messages";

		        // Change these values to match your own account
		        String myUsername = "subashree";
		        String myPassword = "Suba@3107";
		        Random random = new Random();
		        int otp = 100000 + random.nextInt(900000);  // Generates a 6-digit OTP
		        String number = txt_num.getText();

		        // The details of the message we want to send
		        String myData = String.format("{\"to\":\"%s\", \"body\":\"Your OTP is: %d\"}", number, otp);

		        try {
		            URL url = new URL(myURI);
		            HttpURLConnection request = (HttpURLConnection) url.openConnection();
		            request.setDoOutput(true);
		            request.setRequestMethod("POST");
		            request.setRequestProperty("Content-Type", "application/json");

		            // Supply the credentials
		            String authStr = myUsername + ":" + myPassword;
		            String authEncoded = Base64.getEncoder().encodeToString(authStr.getBytes(StandardCharsets.UTF_8));
		            request.setRequestProperty("Authorization", "Basic " + authEncoded);

		            // Write the data to the request
		            try (OutputStream os = request.getOutputStream()) {
		                byte[] input = myData.getBytes(StandardCharsets.UTF_8);
		                os.write(input, 0, input.length);
		            }

		            // Handle the response
		            int responseCode = request.getResponseCode();
		            if (responseCode == HttpURLConnection.HTTP_OK) {
		                try (BufferedReader in = new BufferedReader(new InputStreamReader(request.getInputStream()))) {
		                    String replyText;
		                    while ((replyText = in.readLine()) != null) {
		                        System.out.println(replyText);
		                    }
		                }
		            } else {
		                try (BufferedReader in = new BufferedReader(new InputStreamReader(request.getErrorStream()))) {
		                    String replyText;
		                    while ((replyText = in.readLine()) != null) {
		                        System.out.println(replyText);
		                    }
		                }
		            }

		            request.disconnect();

		        } catch (MalformedURLException ex) {
		            ex.printStackTrace();
		        } catch (IOException ex) {
		            ex.printStackTrace();
		        }
		    }

		    public static void main(String[] args) {
		        JFrame frame = new JFrame("Send OTP");
		        JTextField txt_num = new JTextField(15);
		        JButton sendButton = new JButton("Send OTP");

		        SendMessageAction sendMessageAction = new SendMessageAction(txt_num);
		        sendButton.addActionListener(sendMessageAction);

		        frame.setLayout(new java.awt.FlowLayout());
		        frame.add(new JLabel("Phone Number:"));
		        frame.add(txt_num);
		        frame.add(sendButton);

		        frame.setSize(300, 150);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setVisible(true);
		    }
	
	