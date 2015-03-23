package com.qa.render.utils;

import com.qa.render.R;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

public class AlertUtil {

	/**
	 * Show Alert Dialog
	 * 
	 * @param context
	 * @param titleId
	 * @param messageId
	 */
	public static void showAlert(Context context, int titleId, int messageId) {
		Dialog dlg = new AlertDialog.Builder(context)
				.setIcon(android.R.drawable.ic_dialog_alert).setTitle(titleId)
				.setPositiveButton(android.R.string.ok, null)
				.setMessage(messageId).create();

		dlg.show();
	}

	/**
	 * Show Alert Dialog
	 * 
	 * @param context
	 * @param titleId
	 * @param message
	 */
	public static void showAlert(Context context, int titleId, String message) {
		Dialog dlg = new AlertDialog.Builder(context)
				.setIcon(android.R.drawable.ic_dialog_alert).setTitle(titleId)
				.setPositiveButton(android.R.string.ok, null)
				.setMessage(message).create();

		dlg.show();
	}

	/**
	 * Show Alert Dialog
	 * 
	 * @param context
	 * @param message
	 */
	public static void showAlert(Context context, String message) {
		Dialog dlg = new AlertDialog.Builder(context)
				.setIcon(android.R.drawable.ic_dialog_alert)
				.setTitle(R.string.app_name)
				.setPositiveButton(android.R.string.ok, null)
				.setMessage(message).create();

		dlg.show();
	}

	/**
	 * Show Alert Dialog
	 * 
	 * @param context
	 * @param message
	 * @param positiveListener
	 */
	public static void showAlert(Context context, String message,
			DialogInterface.OnClickListener positiveListener) {
		Dialog dlg = new AlertDialog.Builder(context)
				.setIcon(android.R.drawable.ic_dialog_alert)
				.setTitle(R.string.app_name)
				.setPositiveButton(android.R.string.ok, positiveListener)
				.setMessage(message).create();
		dlg.show();
	}

	/**
	 * Show Alert Dialog
	 * 
	 * @param context
	 * @param titleId
	 * @param messageId
	 * @param positiveButtontxt
	 * @param positiveListener
	 * @param negativeButtontxt
	 * @param negativeListener
	 */
	public static void showAlert(Context context, int titleId, int messageId,
			CharSequence positiveButtontxt,
			DialogInterface.OnClickListener positiveListener,
			CharSequence negativeButtontxt,
			DialogInterface.OnClickListener negativeListener) {
		Dialog dlg = new AlertDialog.Builder(context)
				// .setIcon(android.R.drawable.ic_dialog_alert)
				.setTitle(titleId)
				.setPositiveButton(positiveButtontxt, positiveListener)
				.setNegativeButton(negativeButtontxt, negativeListener)
				.setMessage(messageId).setCancelable(false).create();

		dlg.show();
	}

	/**
	 * Show Alert Dialog
	 * 
	 * @param context
	 * @param titleId
	 * @param message
	 * @param positiveButtontxt
	 * @param positiveListener
	 */
	public static void showAlert(Context context, int titleId, String message,
			CharSequence positiveButtontxt,
			DialogInterface.OnClickListener positiveListener) {
		Dialog dlg = new AlertDialog.Builder(context)
				.setIcon(android.R.drawable.ic_dialog_alert).setTitle(titleId)
				.setPositiveButton(positiveButtontxt, positiveListener)
				.setMessage(message).setCancelable(false).create();

		dlg.show();
	}
}
