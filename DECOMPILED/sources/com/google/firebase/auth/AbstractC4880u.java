package com.google.firebase.auth;

import android.net.Uri;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.p411firebaseauthapi.zzahv;
import com.google.android.gms.tasks.Task;
import java.util.List;
import p164V3.C1762g;
import p177X2.AbstractC1945a;

/* JADX INFO: renamed from: com.google.firebase.auth.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4880u extends AbstractC1945a implements InterfaceC4832P {
    /* JADX INFO: renamed from: T */
    public Task m22057T() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(mo8713d0());
        AbstractC3718s.m18083l(this);
        return firebaseAuth.f18443e.zza(this, new C4869n0(firebaseAuth, this));
    }

    /* JADX INFO: renamed from: U */
    public abstract String mo8704U();

    /* JADX INFO: renamed from: V */
    public abstract String mo8705V();

    /* JADX INFO: renamed from: W */
    public abstract InterfaceC4881v mo8706W();

    /* JADX INFO: renamed from: X */
    public abstract AbstractC4815A mo8707X();

    /* JADX INFO: renamed from: Y */
    public abstract Uri mo8708Y();

    /* JADX INFO: renamed from: Z */
    public abstract List mo8709Z();

    /* JADX INFO: renamed from: a0 */
    public abstract String mo8710a0();

    /* JADX INFO: renamed from: b0 */
    public abstract String mo8711b0();

    /* JADX INFO: renamed from: c0 */
    public abstract boolean mo8712c0();

    /* JADX INFO: renamed from: d0 */
    public abstract C1762g mo8713d0();

    /* JADX INFO: renamed from: e0 */
    public abstract AbstractC4880u mo8714e0(List list);

    /* JADX INFO: renamed from: f0 */
    public abstract void mo8715f0(zzahv zzahvVar);

    /* JADX INFO: renamed from: g0 */
    public abstract AbstractC4880u mo8716g0();

    /* JADX INFO: renamed from: h0 */
    public abstract void mo8717h0(List list);

    /* JADX INFO: renamed from: i0 */
    public abstract zzahv mo8718i0();

    /* JADX INFO: renamed from: j0 */
    public abstract void mo8719j0(List list);

    /* JADX INFO: renamed from: k0 */
    public abstract List mo8720k0();

    public abstract String zzd();

    public abstract String zze();

    public abstract List zzg();
}
