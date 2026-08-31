package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p411firebaseauthapi.zzahv;
import java.util.Objects;
import p192Z3.InterfaceC2111Z;
import p192Z3.InterfaceC2143u;

/* JADX INFO: renamed from: com.google.firebase.auth.p0 */
/* JADX INFO: loaded from: classes.dex */
final class C4873p0 implements InterfaceC2143u, InterfaceC2111Z {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ FirebaseAuth f18548a;

    C4873p0(FirebaseAuth firebaseAuth) {
        Objects.requireNonNull(firebaseAuth);
        this.f18548a = firebaseAuth;
    }

    @Override // p192Z3.InterfaceC2111Z
    /* JADX INFO: renamed from: a */
    public final void mo8675a(zzahv zzahvVar, AbstractC4880u abstractC4880u) {
        this.f18548a.m22001v(abstractC4880u, zzahvVar, true, true);
    }

    @Override // p192Z3.InterfaceC2143u
    public final void zza(Status status) {
        int iM17744U = status.m17744U();
        if (iM17744U == 17011 || iM17744U == 17021 || iM17744U == 17005) {
            this.f18548a.m21995k();
        }
    }
}
