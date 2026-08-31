package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.AbstractC3561i;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.location.AbstractC3970i;
import com.google.android.gms.location.AbstractC3972k;
import com.google.android.gms.location.InterfaceC3966e;
import com.google.android.gms.location.InterfaceC3971j;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzz implements InterfaceC3966e {
    public final AbstractC3561i flushLocations(AbstractC3560h abstractC3560h) {
        return abstractC3560h.mo17772b(new zzq(this, abstractC3560h));
    }

    public final Location getLastLocation(AbstractC3560h abstractC3560h) {
        String str;
        zzaz zzazVarM18396a = AbstractC3972k.m18396a(abstractC3560h);
        Context contextMo17774e = abstractC3560h.mo17774e();
        if (Build.VERSION.SDK_INT < 30 || contextMo17774e == null) {
            str = null;
        } else {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(contextMo17774e, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                str = null;
            }
        }
        try {
            return zzazVarM18396a.zzz(str);
        } catch (Exception unused2) {
            return null;
        }
    }

    public final LocationAvailability getLocationAvailability(AbstractC3560h abstractC3560h) {
        try {
            return AbstractC3972k.m18396a(abstractC3560h).zzA();
        } catch (Exception unused) {
            return null;
        }
    }

    public final AbstractC3561i removeLocationUpdates(AbstractC3560h abstractC3560h, PendingIntent pendingIntent) {
        return abstractC3560h.mo17772b(new zzw(this, abstractC3560h, pendingIntent));
    }

    public final AbstractC3561i requestLocationUpdates(AbstractC3560h abstractC3560h, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return abstractC3560h.mo17772b(new zzu(this, abstractC3560h, locationRequest, pendingIntent));
    }

    public final AbstractC3561i setMockLocation(AbstractC3560h abstractC3560h, Location location) {
        return abstractC3560h.mo17772b(new zzp(this, abstractC3560h, location));
    }

    public final AbstractC3561i setMockMode(AbstractC3560h abstractC3560h, boolean z7) {
        return abstractC3560h.mo17772b(new zzo(this, abstractC3560h, z7));
    }

    public final AbstractC3561i removeLocationUpdates(AbstractC3560h abstractC3560h, AbstractC3970i abstractC3970i) {
        return abstractC3560h.mo17772b(new zzn(this, abstractC3560h, abstractC3970i));
    }

    public final AbstractC3561i requestLocationUpdates(AbstractC3560h abstractC3560h, LocationRequest locationRequest, AbstractC3970i abstractC3970i, Looper looper) {
        return abstractC3560h.mo17772b(new zzt(this, abstractC3560h, locationRequest, abstractC3970i, looper));
    }

    public final AbstractC3561i removeLocationUpdates(AbstractC3560h abstractC3560h, InterfaceC3971j interfaceC3971j) {
        return abstractC3560h.mo17772b(new zzv(this, abstractC3560h, interfaceC3971j));
    }

    public final AbstractC3561i requestLocationUpdates(AbstractC3560h abstractC3560h, LocationRequest locationRequest, InterfaceC3971j interfaceC3971j) {
        AbstractC3718s.m18084m(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        return abstractC3560h.mo17772b(new zzr(this, abstractC3560h, locationRequest, interfaceC3971j));
    }

    public final AbstractC3561i requestLocationUpdates(AbstractC3560h abstractC3560h, LocationRequest locationRequest, InterfaceC3971j interfaceC3971j, Looper looper) {
        return abstractC3560h.mo17772b(new zzs(this, abstractC3560h, locationRequest, interfaceC3971j, looper));
    }
}
