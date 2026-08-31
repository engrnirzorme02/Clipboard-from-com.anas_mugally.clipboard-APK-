package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.lifecycle.AbstractC2636b;
import com.google.android.gms.ads.internal.client.AbstractBinderC3409x0;
import com.google.android.gms.ads.internal.client.C3249C1;
import com.google.android.gms.ads.internal.client.InterfaceC3412y0;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfdy {
    private static zzfdy zza;
    private final Context zzb;
    private final InterfaceC3412y0 zzc;
    private final AtomicReference zzd = new AtomicReference();

    zzfdy(Context context, InterfaceC3412y0 interfaceC3412y0) {
        this.zzb = context;
        this.zzc = interfaceC3412y0;
    }

    public static zzfdy zza(Context context) {
        synchronized (zzfdy.class) {
            try {
                zzfdy zzfdyVar = zza;
                if (zzfdyVar != null) {
                    return zzfdyVar;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) zzbej.zzb.zze()).longValue();
                InterfaceC3412y0 interfaceC3412y0Zzf = null;
                if (jLongValue > 0 && jLongValue <= 253410000) {
                    interfaceC3412y0Zzf = zzf(applicationContext);
                }
                zzfdy zzfdyVar2 = new zzfdy(applicationContext, interfaceC3412y0Zzf);
                zza = zzfdyVar2;
                return zzfdyVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static InterfaceC3412y0 zzf(Context context) {
        try {
            return AbstractBinderC3409x0.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Failed to retrieve lite SDK info.", e7);
            return null;
        }
    }

    private final C3249C1 zzg() {
        InterfaceC3412y0 interfaceC3412y0 = this.zzc;
        if (interfaceC3412y0 != null) {
            try {
                return interfaceC3412y0.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final C7584a zzb(int i7, boolean z7, int i8) {
        C3249C1 c3249c1Zzg;
        C7351t.m32349g();
        boolean zM17416i = C3431F0.m17416i(this.zzb);
        C7584a c7584a = new C7584a(ModuleDescriptor.MODULE_VERSION, i8, true, zM17416i);
        return (((Boolean) zzbej.zzc.zze()).booleanValue() && (c3249c1Zzg = zzg()) != null) ? new C7584a(ModuleDescriptor.MODULE_VERSION, c3249c1Zzg.m17196T(), true, zM17416i) : c7584a;
    }

    public final void zzc(zzbox zzboxVar) {
        zzbox adapterCreator;
        if (!((Boolean) zzbej.zza.zze()).booleanValue()) {
            AbstractC2636b.m12603a(this.zzd, null, zzboxVar);
            return;
        }
        InterfaceC3412y0 interfaceC3412y0 = this.zzc;
        if (interfaceC3412y0 == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = interfaceC3412y0.getAdapterCreator();
            } catch (RemoteException unused) {
                adapterCreator = null;
            }
        }
        AtomicReference atomicReference = this.zzd;
        if (adapterCreator != null) {
            zzboxVar = adapterCreator;
        }
        AbstractC2636b.m12603a(atomicReference, null, zzboxVar);
    }

    public final zzbox zzd() {
        return (zzbox) this.zzd.get();
    }

    public final String zze() {
        C3249C1 c3249c1Zzg = zzg();
        if (c3249c1Zzg != null) {
            return c3249c1Zzg.m17197U();
        }
        return null;
    }
}
