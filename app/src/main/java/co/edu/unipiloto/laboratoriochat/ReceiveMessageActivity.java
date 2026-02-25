package co.edu.unipiloto.laboratoriochat;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;
import android.app.Activity;



public class ReceiveMessageActivity extends AppCompatActivity {

    public void sendReply(View view) {

        EditText editText = findViewById(R.id.editTextReply);
        String reply = editText.getText().toString();

        Intent intent = new Intent();
        intent.putExtra("reply", reply);

        setResult(Activity.RESULT_OK, intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra("message");

        TextView textView = findViewById(R.id.textViewMessage);
        textView.setText(message);
    }
}
