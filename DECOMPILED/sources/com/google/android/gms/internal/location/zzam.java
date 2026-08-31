package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.common.api.internal.InterfaceC3602h;
import com.google.android.gms.location.C3951P;
import com.google.android.gms.location.C3965d;
import com.google.android.gms.location.C3969h;
import com.google.android.gms.location.C3973l;
import com.google.android.gms.location.C3978q;
import com.google.android.gms.location.LocationAvailability;

/* JADX INFO: loaded from: classes2.dex */
public interface zzam extends IInterface {
    void zzd(C3969h c3969h, PendingIntent pendingIntent, zzak zzakVar);

    void zze(PendingIntent pendingIntent, zzak zzakVar, String str);

    void zzf(String[] strArr, zzak zzakVar, String str);

    void zzg(C3951P c3951p, zzak zzakVar);

    void zzh(long j7, boolean z7, PendingIntent pendingIntent);

    void zzi(C3965d c3965d, PendingIntent pendingIntent, InterfaceC3602h interfaceC3602h);

    void zzj(PendingIntent pendingIntent, InterfaceC3602h interfaceC3602h);

    void zzk(PendingIntent pendingIntent);

    void zzl(PendingIntent pendingIntent, InterfaceC3602h interfaceC3602h);

    @Deprecated
    Location zzm();

    Location zzn(String str);

    void zzo(zzbc zzbcVar);

    void zzp(boolean z7);

    void zzq(Location location);

    void zzr(zzai zzaiVar);

    LocationAvailability zzs(String str);

    void zzt(C3973l c3973l, zzao zzaoVar, String str);

    void zzu(zzl zzlVar);

    void zzv(PendingIntent pendingIntent, C3978q c3978q, InterfaceC3602h interfaceC3602h);
}
