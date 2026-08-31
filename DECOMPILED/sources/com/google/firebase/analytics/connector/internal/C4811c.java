package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import java.util.Objects;
import p275j3.C5862a;
import p283k3.AbstractC6052w;

/* JADX INFO: renamed from: com.google.firebase.analytics.connector.internal.c */
/* JADX INFO: loaded from: classes.dex */
final class C4811c implements C5862a.a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4812d f18428a;

    public C4811c(C4812d c4812d) {
        Objects.requireNonNull(c4812d);
        this.f18428a = c4812d;
    }

    @Override // p283k3.InterfaceC6018A
    /* JADX INFO: renamed from: a */
    public final void mo18430a(String str, String str2, Bundle bundle, long j7) {
        C4812d c4812d = this.f18428a;
        if (c4812d.f18429a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            int i7 = AbstractC4810b.f18427g;
            String strM27059a = AbstractC6052w.m27059a(str2);
            if (strM27059a != null) {
                str2 = strM27059a;
            }
            bundle2.putString("events", str2);
            c4812d.m21963a().mo7657a(2, bundle2);
        }
    }
}
