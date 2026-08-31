package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.D2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4018D2 {

    /* JADX INFO: renamed from: a */
    private final String f15155a;

    /* JADX INFO: renamed from: b */
    private boolean f15156b;

    /* JADX INFO: renamed from: c */
    private String f15157c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C4026E2 f15158d;

    public C4018D2(C4026E2 c4026e2, String str, String str2) {
        Objects.requireNonNull(c4026e2);
        this.f15158d = c4026e2;
        AbstractC3718s.m18077f(str);
        this.f15155a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m18459a() {
        if (!this.f15156b) {
            this.f15156b = true;
            C4026E2 c4026e2 = this.f15158d;
            this.f15157c = c4026e2.m18488p().getString(this.f15155a, null);
        }
        return this.f15157c;
    }

    /* JADX INFO: renamed from: b */
    public final void m18460b(String str) {
        SharedPreferences.Editor editorEdit = this.f15158d.m18488p().edit();
        editorEdit.putString(this.f15155a, str);
        editorEdit.apply();
        this.f15157c = str;
    }
}
