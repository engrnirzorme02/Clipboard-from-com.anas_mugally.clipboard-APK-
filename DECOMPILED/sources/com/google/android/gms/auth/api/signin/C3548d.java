package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.d */
/* JADX INFO: loaded from: classes.dex */
final class C3548d implements Comparator {
    C3548d() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((Scope) obj).m17742T().compareTo(((Scope) obj2).m17742T());
    }
}
