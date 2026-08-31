package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3365l2;
import com.google.android.gms.ads.internal.client.C3368m1;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.ads.internal.client.C3411y;
import com.google.android.gms.ads.internal.client.InterfaceC3312Y;
import p332q2.AbstractC6824a;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbaj {
    private InterfaceC3312Y zza;
    private final Context zzb;
    private final String zzc;
    private final C3368m1 zzd;
    private final AbstractC6824a.a zze;
    private final zzbot zzf = new zzbot();
    private final C3365l2 zzg = C3365l2.f14001a;

    public zzbaj(Context context, String str, C3368m1 c3368m1, AbstractC6824a.a aVar) {
        this.zzb = context;
        this.zzc = str;
        this.zzd = c3368m1;
        this.zze = aVar;
    }

    public final void zza() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C3369m2 c3369m2M17290W = C3369m2.m17290W();
            C3411y c3411yM17191b = C3244B.m17191b();
            Context context = this.zzb;
            String str = this.zzc;
            InterfaceC3312Y interfaceC3312YM17345a = c3411yM17191b.m17345a(context, c3369m2M17290W, str, this.zzf);
            this.zza = interfaceC3312YM17345a;
            if (interfaceC3312YM17345a != null) {
                C3368m1 c3368m1 = this.zzd;
                c3368m1.m17284o(jCurrentTimeMillis);
                this.zza.zzJ(new zzazw(this.zze, str));
                this.zza.zze(this.zzg.m17269a(context, c3368m1));
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }
}
