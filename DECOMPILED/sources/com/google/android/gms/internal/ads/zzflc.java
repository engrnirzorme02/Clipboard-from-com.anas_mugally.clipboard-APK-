package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3296S1;
import com.google.android.gms.ads.internal.client.InterfaceC3339f0;
import com.google.android.gms.ads.internal.client.InterfaceC3347h0;
import com.google.android.gms.common.util.InterfaceC3750e;
import java.util.concurrent.ScheduledExecutorService;
import p314o2.EnumC6551c;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzflc {
    private final Context zza;
    private final C7584a zzb;
    private final ScheduledExecutorService zzc;
    private final ClientApi zzd = new ClientApi();
    private final zzfdy zze;
    private final InterfaceC3750e zzf;

    zzflc(Context context, C7584a c7584a, ScheduledExecutorService scheduledExecutorService, zzfdy zzfdyVar, InterfaceC3750e interfaceC3750e) {
        this.zza = context;
        this.zzb = c7584a;
        this.zzc = scheduledExecutorService;
        this.zzf = interfaceC3750e;
        this.zze = zzfdyVar;
    }

    private static zzfkf zzc() {
        return new zzfkf(((Long) C3250D.m17200c().zzd(zzbci.zzC)).longValue(), 2.0d, ((Long) C3250D.m17200c().zzd(zzbci.zzD)).longValue(), 0.2d);
    }

    public final zzflb zza(C3296S1 c3296s1, InterfaceC3339f0 interfaceC3339f0) {
        EnumC6551c enumC6551cM27812c = EnumC6551c.m27812c(c3296s1.f13902b);
        if (enumC6551cM27812c == null) {
            return null;
        }
        int iOrdinal = enumC6551cM27812c.ordinal();
        if (iOrdinal == 1) {
            ClientApi clientApi = this.zzd;
            Context context = this.zza;
            C7584a c7584a = this.zzb;
            return new zzfkh(clientApi, context, c7584a.f30228c, this.zze, c3296s1, interfaceC3339f0, this.zzc, zzc(), this.zzf);
        }
        if (iOrdinal == 2) {
            ClientApi clientApi2 = this.zzd;
            Context context2 = this.zza;
            C7584a c7584a2 = this.zzb;
            return new zzflf(clientApi2, context2, c7584a2.f30228c, this.zze, c3296s1, interfaceC3339f0, this.zzc, zzc(), this.zzf);
        }
        if (iOrdinal != 5) {
            return null;
        }
        ClientApi clientApi3 = this.zzd;
        Context context3 = this.zza;
        C7584a c7584a3 = this.zzb;
        return new zzfke(clientApi3, context3, c7584a3.f30228c, this.zze, c3296s1, interfaceC3339f0, this.zzc, zzc(), this.zzf);
    }

    public final zzflb zzb(String str, C3296S1 c3296s1, InterfaceC3347h0 interfaceC3347h0) {
        EnumC6551c enumC6551cM27812c = EnumC6551c.m27812c(c3296s1.f13902b);
        if (enumC6551cM27812c == null) {
            return null;
        }
        int iOrdinal = enumC6551cM27812c.ordinal();
        if (iOrdinal == 1) {
            ClientApi clientApi = this.zzd;
            Context context = this.zza;
            C7584a c7584a = this.zzb;
            return new zzfkh(str, clientApi, context, c7584a.f30228c, this.zze, c3296s1, interfaceC3347h0, this.zzc, zzc(), this.zzf);
        }
        if (iOrdinal == 2) {
            ClientApi clientApi2 = this.zzd;
            Context context2 = this.zza;
            C7584a c7584a2 = this.zzb;
            return new zzflf(str, clientApi2, context2, c7584a2.f30228c, this.zze, c3296s1, interfaceC3347h0, this.zzc, zzc(), this.zzf);
        }
        if (iOrdinal != 5) {
            return null;
        }
        ClientApi clientApi3 = this.zzd;
        Context context3 = this.zza;
        C7584a c7584a3 = this.zzb;
        return new zzfke(str, clientApi3, context3, c7584a3.f30228c, this.zze, c3296s1, interfaceC3347h0, this.zzc, zzc(), this.zzf);
    }
}
