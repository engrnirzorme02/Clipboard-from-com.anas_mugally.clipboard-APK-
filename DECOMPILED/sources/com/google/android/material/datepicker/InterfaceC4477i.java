package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.AbstractC4546v;
import java.util.Collection;

/* JADX INFO: renamed from: com.google.android.material.datepicker.i */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4477i extends Parcelable {
    /* JADX INFO: renamed from: P */
    static boolean m20272P(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    /* JADX INFO: renamed from: w */
    static void m20273w(final EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: com.google.android.material.datepicker.g
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z7) {
                InterfaceC4477i.m20274z(editTextArr, view, z7);
            }
        };
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(onFocusChangeListener);
        }
        final EditText editText2 = editTextArr[0];
        editText2.postDelayed(new Runnable() { // from class: com.google.android.material.datepicker.h
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4546v.m20837l(editText2, false);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: z */
    static /* synthetic */ void m20274z(EditText[] editTextArr, View view, boolean z7) {
        for (EditText editText : editTextArr) {
            if (editText.hasFocus()) {
                return;
            }
        }
        AbstractC4546v.m20833h(view, false);
    }

    /* JADX INFO: renamed from: A */
    String mo20275A(Context context);

    /* JADX INFO: renamed from: C */
    int mo20276C(Context context);

    /* JADX INFO: renamed from: F */
    boolean mo20277F();

    /* JADX INFO: renamed from: I */
    Collection mo20278I();

    /* JADX INFO: renamed from: K */
    Object mo20279K();

    /* JADX INFO: renamed from: O */
    void mo20280O(long j7);

    /* JADX INFO: renamed from: j */
    String mo20281j(Context context);

    /* JADX INFO: renamed from: k */
    Collection mo20282k();

    /* JADX INFO: renamed from: p */
    void mo20283p(Object obj);

    /* JADX INFO: renamed from: x */
    View mo20284x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, C4469a c4469a, AbstractC4492x abstractC4492x);

    /* JADX INFO: renamed from: y */
    int mo20285y();
}
