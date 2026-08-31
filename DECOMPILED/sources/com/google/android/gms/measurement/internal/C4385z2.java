package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.z2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4385z2 {

    /* JADX INFO: renamed from: a */
    private final String f16258a;

    /* JADX INFO: renamed from: b */
    private final boolean f16259b;

    /* JADX INFO: renamed from: c */
    private boolean f16260c;

    /* JADX INFO: renamed from: d */
    private boolean f16261d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C4026E2 f16262e;

    public C4385z2(C4026E2 c4026e2, String str, boolean z7) {
        Objects.requireNonNull(c4026e2);
        this.f16262e = c4026e2;
        AbstractC3718s.m18077f(str);
        this.f16258a = str;
        this.f16259b = z7;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m19333a() {
        if (!this.f16260c) {
            this.f16260c = true;
            C4026E2 c4026e2 = this.f16262e;
            this.f16261d = c4026e2.m18488p().getBoolean(this.f16258a, this.f16259b);
        }
        return this.f16261d;
    }

    /* JADX INFO: renamed from: b */
    public final void m19334b(boolean z7) {
        SharedPreferences.Editor editorEdit = this.f16262e.m18488p().edit();
        editorEdit.putBoolean(this.f16258a, z7);
        editorEdit.apply();
        this.f16261d = z7;
    }
}
