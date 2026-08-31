package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.AbstractC4542r;
import com.google.android.material.internal.AbstractC4546v;
import com.google.android.material.textfield.TextInputLayout;
import p325p3.AbstractC6746g;
import p325p3.AbstractC6748i;

/* JADX INFO: loaded from: classes2.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: a */
    private final Chip f18137a;

    /* JADX INFO: renamed from: b */
    private final TextInputLayout f18138b;

    /* JADX INFO: renamed from: c */
    private final EditText f18139c;

    /* JADX INFO: renamed from: d */
    private TextWatcher f18140d;

    /* JADX INFO: renamed from: e */
    private TextView f18141e;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ChipTextInputComboView$b */
    private class C4660b extends AbstractC4542r {
        private C4660b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f18137a.setText(ChipTextInputComboView.this.m21750c("00"));
                return;
            }
            String strM21750c = ChipTextInputComboView.this.m21750c(editable);
            Chip chip = ChipTextInputComboView.this.f18137a;
            if (TextUtils.isEmpty(strM21750c)) {
                strM21750c = ChipTextInputComboView.this.m21750c("00");
            }
            chip.setText(strM21750c);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public String m21750c(CharSequence charSequence) {
        return C4674e.m21793a(getResources(), charSequence);
    }

    /* JADX INFO: renamed from: d */
    private void m21751d() {
        this.f18139c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f18137a.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m21751d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z7) {
        this.f18137a.setChecked(z7);
        this.f18139c.setVisibility(z7 ? 0 : 4);
        this.f18137a.setVisibility(z7 ? 8 : 0);
        if (isChecked()) {
            AbstractC4546v.m20837l(this.f18139c, false);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f18137a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i7, Object obj) {
        this.f18137a.setTag(i7, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f18137a.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(AbstractC6748i.f26468q, (ViewGroup) this, false);
        this.f18137a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(AbstractC6748i.f26469r, (ViewGroup) this, false);
        this.f18138b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f18139c = editText;
        editText.setVisibility(4);
        C4660b c4660b = new C4660b();
        this.f18140d = c4660b;
        editText.addTextChangedListener(c4660b);
        m21751d();
        addView(chip);
        addView(textInputLayout);
        this.f18141e = (TextView) findViewById(AbstractC6746g.f26433p);
        editText.setId(View.generateViewId());
        this.f18141e.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
