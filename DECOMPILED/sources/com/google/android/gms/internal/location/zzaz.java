package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.internal.BinderC3626t;
import com.google.android.gms.common.api.internal.C3610l;
import com.google.android.gms.common.api.internal.InterfaceC3596e;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.internal.C3690e;
import com.google.android.gms.common.util.AbstractC3747b;
import com.google.android.gms.location.AbstractC3962a0;
import com.google.android.gms.location.C3951P;
import com.google.android.gms.location.C3965d;
import com.google.android.gms.location.C3969h;
import com.google.android.gms.location.C3973l;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaz extends zzi {
    private final zzav zzf;

    public zzaz(Context context, Looper looper, AbstractC3560h.b bVar, AbstractC3560h.c cVar, String str, C3690e c3690e) {
        super(context, looper, bVar, cVar, str, c3690e);
        this.zzf = new zzav(context, this.zze);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c, com.google.android.gms.common.api.C3553a.f
    public final void disconnect() {
        synchronized (this.zzf) {
            if (isConnected()) {
                try {
                    this.zzf.zzn();
                    this.zzf.zzo();
                } catch (Exception e7) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e7);
                }
                super.disconnect();
            } else {
                super.disconnect();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final LocationAvailability zzA() {
        return this.zzf.zzc();
    }

    public final void zzB(zzba zzbaVar, C3610l c3610l, zzai zzaiVar) {
        synchronized (this.zzf) {
            this.zzf.zze(zzbaVar, c3610l, zzaiVar);
        }
    }

    public final void zzC(LocationRequest locationRequest, C3610l c3610l, zzai zzaiVar) {
        synchronized (this.zzf) {
            this.zzf.zzd(locationRequest, c3610l, zzaiVar);
        }
    }

    public final void zzD(zzba zzbaVar, PendingIntent pendingIntent, zzai zzaiVar) {
        this.zzf.zzf(zzbaVar, pendingIntent, zzaiVar);
    }

    public final void zzE(LocationRequest locationRequest, PendingIntent pendingIntent, zzai zzaiVar) {
        this.zzf.zzg(locationRequest, pendingIntent, zzaiVar);
    }

    public final void zzF(C3610l.a aVar, zzai zzaiVar) {
        this.zzf.zzh(aVar, zzaiVar);
    }

    public final void zzG(PendingIntent pendingIntent, zzai zzaiVar) {
        this.zzf.zzj(pendingIntent, zzaiVar);
    }

    public final void zzH(C3610l.a aVar, zzai zzaiVar) {
        this.zzf.zzi(aVar, zzaiVar);
    }

    public final void zzI(boolean z7) {
        this.zzf.zzk(z7);
    }

    public final void zzJ(Location location) {
        this.zzf.zzl(location);
    }

    public final void zzK(zzai zzaiVar) {
        this.zzf.zzm(zzaiVar);
    }

    public final void zzL(C3973l c3973l, InterfaceC3596e interfaceC3596e, String str) {
        checkConnected();
        AbstractC3718s.m18073b(c3973l != null, "locationSettingsRequest can't be null nor empty.");
        AbstractC3718s.m18073b(interfaceC3596e != null, "listener can't be null.");
        ((zzam) getService()).zzt(c3973l, new zzay(interfaceC3596e), null);
    }

    public final void zzq(long j7, PendingIntent pendingIntent) {
        checkConnected();
        AbstractC3718s.m18083l(pendingIntent);
        AbstractC3718s.m18073b(j7 >= 0, "detectionIntervalMillis must be >= 0");
        ((zzam) getService()).zzh(j7, true, pendingIntent);
    }

    public final void zzr(C3965d c3965d, PendingIntent pendingIntent, InterfaceC3596e interfaceC3596e) {
        checkConnected();
        AbstractC3718s.m18084m(c3965d, "activityTransitionRequest must be specified.");
        AbstractC3718s.m18084m(pendingIntent, "PendingIntent must be specified.");
        AbstractC3718s.m18084m(interfaceC3596e, "ResultHolder not provided.");
        ((zzam) getService()).zzi(c3965d, pendingIntent, new BinderC3626t(interfaceC3596e));
    }

    public final void zzs(PendingIntent pendingIntent, InterfaceC3596e interfaceC3596e) {
        checkConnected();
        AbstractC3718s.m18084m(interfaceC3596e, "ResultHolder not provided.");
        ((zzam) getService()).zzj(pendingIntent, new BinderC3626t(interfaceC3596e));
    }

    public final void zzt(PendingIntent pendingIntent) {
        checkConnected();
        AbstractC3718s.m18083l(pendingIntent);
        ((zzam) getService()).zzk(pendingIntent);
    }

    public final void zzu(PendingIntent pendingIntent, InterfaceC3596e interfaceC3596e) {
        checkConnected();
        AbstractC3718s.m18084m(pendingIntent, "PendingIntent must be specified.");
        AbstractC3718s.m18084m(interfaceC3596e, "ResultHolder not provided.");
        ((zzam) getService()).zzl(pendingIntent, new BinderC3626t(interfaceC3596e));
    }

    public final void zzv(C3969h c3969h, PendingIntent pendingIntent, InterfaceC3596e interfaceC3596e) {
        checkConnected();
        AbstractC3718s.m18084m(c3969h, "geofencingRequest can't be null.");
        AbstractC3718s.m18084m(pendingIntent, "PendingIntent must be specified.");
        AbstractC3718s.m18084m(interfaceC3596e, "ResultHolder not provided.");
        ((zzam) getService()).zzd(c3969h, pendingIntent, new zzaw(interfaceC3596e));
    }

    public final void zzw(C3951P c3951p, InterfaceC3596e interfaceC3596e) {
        checkConnected();
        AbstractC3718s.m18084m(c3951p, "removeGeofencingRequest can't be null.");
        AbstractC3718s.m18084m(interfaceC3596e, "ResultHolder not provided.");
        ((zzam) getService()).zzg(c3951p, new zzax(interfaceC3596e));
    }

    public final void zzx(PendingIntent pendingIntent, InterfaceC3596e interfaceC3596e) {
        checkConnected();
        AbstractC3718s.m18084m(pendingIntent, "PendingIntent must be specified.");
        AbstractC3718s.m18084m(interfaceC3596e, "ResultHolder not provided.");
        ((zzam) getService()).zze(pendingIntent, new zzax(interfaceC3596e), getContext().getPackageName());
    }

    public final void zzy(List<String> list, InterfaceC3596e interfaceC3596e) {
        checkConnected();
        AbstractC3718s.m18073b(list != null && list.size() > 0, "geofenceRequestIds can't be null nor empty.");
        AbstractC3718s.m18084m(interfaceC3596e, "ResultHolder not provided.");
        ((zzam) getService()).zzf((String[]) list.toArray(new String[0]), new zzax(interfaceC3596e), getContext().getPackageName());
    }

    public final Location zzz(String str) {
        return AbstractC3747b.m18145b(getAvailableFeatures(), AbstractC3962a0.f15012c) ? this.zzf.zza(str) : this.zzf.zzb();
    }
}
