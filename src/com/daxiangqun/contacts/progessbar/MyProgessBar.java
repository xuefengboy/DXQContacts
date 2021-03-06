package com.daxiangqun.contacts.progessbar;

import com.daxiangqun.contacts.R;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
public class MyProgessBar extends Dialog{
	public MyProgessBar(Context context, int theme) {
		super(context, theme);
	}
	/** 
     * 得到自定义的progressDialog 
     * @param context 
     * @param msg 
     * @return 
     */  
    public static Dialog createLoadingDialog(Context context, String msg) {  
  
        LayoutInflater inflater = LayoutInflater.from(context);  
        View v = inflater.inflate(R.layout.loading_dialog, null);// 得到加载view  
        LinearLayout layout = (LinearLayout) v.findViewById(R.id.dialog_view);// 加载布局  
        Dialog loadingDialog = new Dialog(context,R.style.loading_dialog);// 创建自定义样式dialog  
        //loadingDialog.setCancelable(false);// 不可以用“返回键”取消  
        loadingDialog.setCanceledOnTouchOutside(false);//点击对话框外的无反应，点击“返回键”可以取消
        loadingDialog.setCancelable(false);//点击“返回键”不可取消
        loadingDialog.setContentView(layout, new LinearLayout.LayoutParams(  
                LinearLayout.LayoutParams.MATCH_PARENT,  
                LinearLayout.LayoutParams.MATCH_PARENT));// 设置布局  
        return loadingDialog;  
  
    }
}
