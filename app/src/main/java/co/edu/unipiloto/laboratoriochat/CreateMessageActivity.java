package co.edu.unipiloto.laboratoriochat;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import android.app.Activity;
import android.widget.TextView;



public class CreateMessageActivity extends AppCompatActivity {

    private ActivityResultLauncher<Intent> activityLauncher;

    public void sendMessage(View view) {
        EditText editText = findViewById(R.id.editTextMessage);
        String message = editText.getText().toString().trim();

        if (message.isEmpty()) {
            Toast.makeText(this, "Debes escribir un mensaje antes de enviar!", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        intent.putExtra("message", message);

        activityLauncher.launch(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_create_message);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        activityLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if (result.getResultCode() == Activity.RESULT_OK && result.getData() != null) {

                        String reply = result.getData().getStringExtra("reply");

                        TextView textViewReply = findViewById(R.id.textViewReply);
                        textViewReply.setText("Respuesta recibida: " + reply);
                    }
                }
        );
    }
}