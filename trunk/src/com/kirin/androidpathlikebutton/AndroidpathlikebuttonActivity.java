package com.kirin.androidpathlikebutton;

import java.util.ArrayList;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class AndroidpathlikebuttonActivity extends Activity implements specialmenuCallBack{
    /** Called when the activity is first created. */
	RelativeLayout customLinearLayout = null;
	TextView tv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        buildCustomLayout();
        buildCustomLayout2();
        buildCustomLayout3();
        buildCustomLayout4();
        tv  = (TextView) findViewById(R.id.textView1);
        tv.setTextColor(Color.BLACK);
    }
    
    private void buildCustomLayout()
    {
    	ArrayList<specialmenuModel> _model = new ArrayList<specialmenuModel>();
    	for(int i = 0; i < 5; i++)
    	{
    		specialmenuModel m = new specialmenuModel();
    		m.name = "" + i;
    		m.Rid = R.drawable.bgbutton;
    		_model.add(m);
    	}
	    specialmenu ownview = new specialmenu(this ,300 ,  0 , _model);	
	    ownview.setspecialmenuCallBack(this);
    	this.customLinearLayout = (RelativeLayout) findViewById(R.id.relativeLayout1);
    	this.customLinearLayout.setBackgroundColor(Color.WHITE);
    	RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(300,300);
    	this.customLinearLayout.addView(ownview, lp);
    }

    private void buildCustomLayout2()
    {
    	ArrayList<specialmenuModel> _model = new ArrayList<specialmenuModel>();
    	for(int i = 0; i < 6; i++)
    	{
    		specialmenuModel m = new specialmenuModel();
    		m.name = "" + i;
    		m.Rid = R.drawable.bgbutton;
    		_model.add(m);
    	}
	    specialmenu ownview = new specialmenu(this ,300,  3 , _model);	
	    ownview.setspecialmenuCallBack(this);
    	this.customLinearLayout = (RelativeLayout) findViewById(R.id.relativeLayout1);
    	this.customLinearLayout.setBackgroundColor(Color.WHITE);
    	RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(300,300);
    	lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
    	lp.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
    	this.customLinearLayout.addView(ownview, lp);
    }
    private void buildCustomLayout3()
    {
    	ArrayList<specialmenuModel> _model = new ArrayList<specialmenuModel>();
    	for(int i = 0; i < 5; i++)
    	{
    		specialmenuModel m = new specialmenuModel();
    		m.name = "" + i;
    		m.Rid = R.drawable.bgbutton;
    		_model.add(m);
    	}
	    specialmenu ownview = new specialmenu(this ,300,  1 , _model);	
	    ownview.setspecialmenuCallBack(this);
    	this.customLinearLayout = (RelativeLayout) findViewById(R.id.relativeLayout1);
    	this.customLinearLayout.setBackgroundColor(Color.WHITE);
    	RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(300,300);
    	lp.addRule(RelativeLayout.ALIGN_PARENT_TOP);
    	lp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
    	this.customLinearLayout.addView(ownview, lp);
    }
    private void buildCustomLayout4()
    {
    	ArrayList<specialmenuModel> _model = new ArrayList<specialmenuModel>();
    	for(int i = 0; i < 5; i++)
    	{
    		specialmenuModel m = new specialmenuModel();
    		m.name = "" + i;
    		m.Rid = R.drawable.bgbutton;
    		_model.add(m);
    	}
	    specialmenu ownview = new specialmenu(this ,300,  2 , _model);	
	    ownview.setspecialmenuCallBack(this);
    	this.customLinearLayout = (RelativeLayout) findViewById(R.id.relativeLayout1);
    	this.customLinearLayout.setBackgroundColor(Color.WHITE);
    	RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(300,300);
    	lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
    	lp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
    	this.customLinearLayout.addView(ownview, lp);
    }
    
	@Override
	public void subMenuEvent(int actionid) {
		// TODO Auto-generated method stub
		switch(actionid)
		{
			default:
				tv.setText(" SubMenuButtonClick : " + actionid);
				break;
		}
		
	}
}

