package csB7.my;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UIT_B_Gr7_CALCIActivity extends Activity {
    /** Called when the activity is first created. */
    
    Button b1,b2,b3,b4,b5;
    EditText e1, e2;
    TextView t1;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        t1=(TextView)findViewById(R.id.textView1);
        b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String s1=e1.getText().toString();
				String s2=e2.getText().toString();
				Integer a=Integer.parseInt(s1);
				Integer b=Integer.parseInt(s2);
				Integer c=a+b;
				String an=Integer.toString(c);
				t1.setText(an);
				
			}
		});
       b2.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			String s1=e1.getText().toString();
			String s2=e2.getText().toString();
			Integer a=Integer.parseInt(s1);
			Integer b=Integer.parseInt(s2);
			Integer c=a-b;
			String an=Integer.toString(c);
			t1.setText(an);
		
		}
	});     
       b3.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			String s1=e1.getText().toString();
			String s2=e2.getText().toString();
			Integer a=Integer.parseInt(s1);
			Integer b=Integer.parseInt(s2);
			Integer c=a*b;
			String an=Integer.toString(c);
			t1.setText(an);
		
		}
	});
       b4.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			String s1=e1.getText().toString();
			String s2=e2.getText().toString();
			Integer a=Integer.parseInt(s1);
			Integer b=Integer.parseInt(s2);
			Integer c=a/b;
			String an=Integer.toString(c);
			t1.setText(an);
		
		}
	});
       b5.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		String s="";
		e1.setText(s);
		e2.setText(s);
		t1.setText(s);
		}
	});
        }
        
    }
