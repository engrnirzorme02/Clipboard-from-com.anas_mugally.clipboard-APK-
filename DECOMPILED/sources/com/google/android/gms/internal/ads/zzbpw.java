package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.appcompat.app.AbstractC2263x;
import java.util.Objects;
import p012B2.InterfaceC0063d;
import p314o2.C6550b;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzbpw implements InterfaceC0063d {
    final /* synthetic */ zzbpd zza;
    final /* synthetic */ zzbpy zzb;

    zzbpw(zzbpy zzbpyVar, zzbpd zzbpdVar) {
        this.zza = zzbpdVar;
        Objects.requireNonNull(zzbpyVar);
        this.zzb = zzbpyVar;
    }

    @Override // p012B2.InterfaceC0063d
    public final void onFailure(C6550b c6550b) {
        try {
            String canonicalName = this.zzb.zzb().getClass().getCanonicalName();
            int iM27807a = c6550b.m27807a();
            String strM27809c = c6550b.m27809c();
            String strM27808b = c6550b.m27808b();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(iM27807a).length() + 17 + String.valueOf(strM27809c).length() + 16 + String.valueOf(strM27808b).length());
            sb.append(canonicalName);
            sb.append("failed to load mediation ad: ErrorCode = ");
            sb.append(iM27807a);
            sb.append(". ErrorMessage = ");
            sb.append(strM27809c);
            sb.append(". ErrorDomain = ");
            sb.append(strM27808b);
            AbstractC7599p.m33326a(sb.toString());
            zzbpd zzbpdVar = this.zza;
            zzbpdVar.zzx(c6550b.m27810d());
            zzbpdVar.zzw(c6550b.m27807a(), c6550b.m27809c());
            zzbpdVar.zzg(c6550b.m27807a());
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        AbstractC2263x.m9328a(obj);
        try {
            this.zzb.zzS(null);
            this.zza.zzj();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
        return new zzbwq(this.zza);
    }

    public final void onFailure(String str) {
        try {
            String canonicalName = this.zzb.zzb().getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 31 + String.valueOf(str).length());
            sb.append(canonicalName);
            sb.append("failed to loaded mediation ad: ");
            sb.append(str);
            AbstractC7599p.m33326a(sb.toString());
            zzbpd zzbpdVar = this.zza;
            zzbpdVar.zzw(0, str);
            zzbpdVar.zzg(0);
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
    }
}
