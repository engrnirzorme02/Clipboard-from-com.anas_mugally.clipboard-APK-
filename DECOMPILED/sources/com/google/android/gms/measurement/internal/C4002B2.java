package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.B2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4002B2 {

    /* JADX INFO: renamed from: a */
    private final String f15088a;

    /* JADX INFO: renamed from: b */
    private final long f15089b;

    /* JADX INFO: renamed from: c */
    private boolean f15090c;

    /* JADX INFO: renamed from: d */
    private long f15091d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C4026E2 f15092e;

    public C4002B2(C4026E2 c4026e2, String str, long j7) {
        Objects.requireNonNull(c4026e2);
        this.f15092e = c4026e2;
        AbstractC3718s.m18077f(str);
        this.f15088a = str;
        this.f15089b = j7;
    }

    /* JADX INFO: renamed from: a */
    public final long m18433a() {
        if (!this.f15090c) {
            this.f15090c = true;
            C4026E2 c4026e2 = this.f15092e;
            this.f15091d = c4026e2.m18488p().getLong(this.f15088a, this.f15089b);
        }
        return this.f15091d;
    }

    /* JADX INFO: renamed from: b */
    public final void m18434b(long j7) {
        SharedPreferences.Editor editorEdit = this.f15092e.m18488p().edit();
        editorEdit.putLong(this.f15088a, j7);
        editorEdit.apply();
        this.f15091d = j7;
    }
}
