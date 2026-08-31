package com.google.android.material.datepicker;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.internal.AbstractC4542r;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import p325p3.AbstractC6750k;

/* JADX INFO: renamed from: com.google.android.material.datepicker.f */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4474f extends AbstractC4542r {

    /* JADX INFO: renamed from: a */
    private final TextInputLayout f16879a;

    /* JADX INFO: renamed from: b */
    private final String f16880b;

    /* JADX INFO: renamed from: c */
    private final DateFormat f16881c;

    /* JADX INFO: renamed from: d */
    private final C4469a f16882d;

    /* JADX INFO: renamed from: e */
    private final String f16883e;

    /* JADX INFO: renamed from: f */
    private final Runnable f16884f;

    /* JADX INFO: renamed from: r */
    private Runnable f16885r;

    /* JADX INFO: renamed from: s */
    private int f16886s = 0;

    AbstractC4474f(final String str, DateFormat dateFormat, TextInputLayout textInputLayout, C4469a c4469a) {
        this.f16880b = str;
        this.f16881c = dateFormat;
        this.f16879a = textInputLayout;
        this.f16882d = c4469a;
        this.f16883e = textInputLayout.getContext().getString(AbstractC6750k.f26482D);
        this.f16884f = new Runnable() { // from class: com.google.android.material.datepicker.d
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4474f.m20265b(this.f16875a, str);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m20264a(AbstractC4474f abstractC4474f, long j7) {
        abstractC4474f.getClass();
        abstractC4474f.f16879a.setError(String.format(abstractC4474f.f16883e, abstractC4474f.m20267g(AbstractC4478j.m20288c(j7))));
        abstractC4474f.mo20268d();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m20265b(AbstractC4474f abstractC4474f, String str) {
        TextInputLayout textInputLayout = abstractC4474f.f16879a;
        DateFormat dateFormat = abstractC4474f.f16881c;
        Context context = textInputLayout.getContext();
        textInputLayout.setError(context.getString(AbstractC6750k.f26524x) + "\n" + String.format(context.getString(AbstractC6750k.f26526z), abstractC4474f.m20267g(str)) + "\n" + String.format(context.getString(AbstractC6750k.f26525y), abstractC4474f.m20267g(dateFormat.format(new Date(AbstractC4466C.m20221k().getTimeInMillis())))));
        abstractC4474f.mo20268d();
    }

    /* JADX INFO: renamed from: c */
    private Runnable m20266c(final long j7) {
        return new Runnable() { // from class: com.google.android.material.datepicker.e
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4474f.m20264a(this.f16877a, j7);
            }
        };
    }

    /* JADX INFO: renamed from: g */
    private String m20267g(String str) {
        return str.replace(' ', (char) 160);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (!Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) && editable.length() != 0 && editable.length() < this.f16880b.length() && editable.length() >= this.f16886s) {
            char cCharAt = this.f16880b.charAt(editable.length());
            if (Character.isLetterOrDigit(cCharAt)) {
                return;
            }
            editable.append(cCharAt);
        }
    }

    @Override // com.google.android.material.internal.AbstractC4542r, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        this.f16886s = charSequence.length();
    }

    /* JADX INFO: renamed from: d */
    abstract void mo20268d();

    /* JADX INFO: renamed from: e */
    abstract void mo20269e(Long l7);

    /* JADX INFO: renamed from: f */
    public void m20270f(View view, Runnable runnable) {
        view.post(runnable);
    }

    @Override // com.google.android.material.internal.AbstractC4542r, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        this.f16879a.removeCallbacks(this.f16884f);
        this.f16879a.removeCallbacks(this.f16885r);
        this.f16879a.setError(null);
        mo20269e(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.f16880b.length()) {
            return;
        }
        try {
            Date date = this.f16881c.parse(charSequence.toString());
            this.f16879a.setError(null);
            long time = date.getTime();
            if (this.f16882d.m20245g().mo20258D(time) && this.f16882d.m20252r(time)) {
                mo20269e(Long.valueOf(date.getTime()));
                return;
            }
            Runnable runnableM20266c = m20266c(time);
            this.f16885r = runnableM20266c;
            m20270f(this.f16879a, runnableM20266c);
        } catch (ParseException unused) {
            m20270f(this.f16879a, this.f16884f);
        }
    }
}
