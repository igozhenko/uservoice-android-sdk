package com.uservoice.uservoicesdk.activity;

import android.os.Bundle;

import com.uservoice.uservoicesdk.R;
import com.uservoice.uservoicesdk.ui.ContactAdapter;
import com.uservoice.uservoicesdk.ui.InstantAnswersAdapter;

public class ContactActivity extends InstantAnswersActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle(R.string.contact_us);
	}

	@Override
	protected InstantAnswersAdapter createAdapter() {
		return new ContactAdapter(this);
	}

	@Override
	protected int getDiscardDialogMessage() {
		return R.string.msg_confirm_discard_message;
	}
}
