package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import p118P.C1170s;

/* JADX INFO: renamed from: com.google.android.material.textfield.s */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4651s {

    /* JADX INFO: renamed from: a */
    final TextInputLayout f18073a;

    /* JADX INFO: renamed from: b */
    final C4650r f18074b;

    /* JADX INFO: renamed from: c */
    final Context f18075c;

    /* JADX INFO: renamed from: d */
    final CheckableImageButton f18076d;

    AbstractC4651s(C4650r c4650r) {
        this.f18073a = c4650r.f18051a;
        this.f18074b = c4650r;
        this.f18075c = c4650r.getContext();
        this.f18076d = c4650r.m21624r();
    }

    /* JADX INFO: renamed from: a */
    void mo21513a(Editable editable) {
    }

    /* JADX INFO: renamed from: b */
    void mo21637b(CharSequence charSequence, int i7, int i8, int i9) {
    }

    /* JADX INFO: renamed from: c */
    int mo21514c() {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    int mo21515d() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    View.OnFocusChangeListener mo21516e() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    View.OnClickListener mo21517f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    View.OnFocusChangeListener mo21518g() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    AccessibilityManager.TouchExplorationStateChangeListener mo21547h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    boolean mo21548i(int i7) {
        return true;
    }

    /* JADX INFO: renamed from: j */
    boolean mo21549j() {
        return false;
    }

    /* JADX INFO: renamed from: k */
    boolean mo21550k() {
        return false;
    }

    /* JADX INFO: renamed from: l */
    boolean mo21551l() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    boolean mo21552m() {
        return false;
    }

    /* JADX INFO: renamed from: n */
    void mo21519n(EditText editText) {
    }

    /* JADX INFO: renamed from: o */
    void mo21553o(View view, C1170s c1170s) {
    }

    /* JADX INFO: renamed from: p */
    void mo21554p(View view, AccessibilityEvent accessibilityEvent) {
    }

    /* JADX INFO: renamed from: q */
    void mo21520q(boolean z7) {
    }

    /* JADX INFO: renamed from: r */
    final void m21638r() {
        this.f18074b.m21586L(false);
    }

    /* JADX INFO: renamed from: s */
    void mo21521s() {
    }

    /* JADX INFO: renamed from: t */
    boolean mo21555t() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    void mo21522u() {
    }
}
