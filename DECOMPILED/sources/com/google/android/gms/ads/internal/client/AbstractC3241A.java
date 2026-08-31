package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbed;
import com.google.android.gms.internal.ads.zzber;
import p404z2.AbstractC7599p;
import p404z2.C7590g;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.A */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC3241A {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC3387r0 f13865a;

    static {
        InterfaceC3387r0 c3379p0 = null;
        try {
            Object objNewInstance = C3411y.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    c3379p0 = iInterfaceQueryLocalInterface instanceof InterfaceC3387r0 ? (InterfaceC3387r0) iInterfaceQueryLocalInterface : new C3379p0(iBinder);
                }
            } else {
                AbstractC7599p.m33331f("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            AbstractC7599p.m33331f("Failed to instantiate ClientApi class.");
        }
        f13865a = c3379p0;
    }

    AbstractC3241A() {
    }

    /* JADX INFO: renamed from: e */
    private final Object m17183e() {
        InterfaceC3387r0 interfaceC3387r0 = f13865a;
        if (interfaceC3387r0 == null) {
            AbstractC7599p.m33331f("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return mo17187c(interfaceC3387r0);
        } catch (RemoteException e7) {
            AbstractC7599p.m33332g("Cannot invoke local loader using ClientApi class.", e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    private final Object m17184f() {
        try {
            return mo17186b();
        } catch (RemoteException e7) {
            AbstractC7599p.m33332g("Cannot invoke remote loader.", e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    protected abstract Object mo17185a();

    /* JADX INFO: renamed from: b */
    protected abstract Object mo17186b();

    /* JADX INFO: renamed from: c */
    protected abstract Object mo17187c(InterfaceC3387r0 interfaceC3387r0);

    /* JADX INFO: renamed from: d */
    public final Object m17188d(Context context, boolean z7) {
        boolean z8;
        Object objM17183e;
        if (!z7) {
            C3244B.m17190a();
            if (!C7590g.m33271A(context, 12451000)) {
                AbstractC7599p.m33326a("Google Play Services is not available.");
                z7 = true;
            }
        }
        boolean z9 = false;
        boolean z10 = !(DynamiteModule.m18222a(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.m18223c(context, ModuleDescriptor.MODULE_ID));
        zzbci.zza(context);
        if (((Boolean) zzbed.zza.zze()).booleanValue()) {
            z8 = false;
        } else if (((Boolean) zzbed.zzb.zze()).booleanValue()) {
            z8 = true;
            z9 = true;
        } else {
            z9 = z7 | z10;
            z8 = false;
        }
        if (z9) {
            objM17183e = m17183e();
            if (objM17183e == null && !z8) {
                objM17183e = m17184f();
            }
        } else {
            Object objM17184f = m17184f();
            if (objM17184f == null) {
                if (C3244B.m17194e().nextInt(((Long) zzber.zza.zze()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    C3244B.m17190a().m33295q(context, C3244B.m17193d().f30226a, "gmob-apps", bundle, true);
                }
            }
            objM17183e = objM17184f == null ? m17183e() : objM17184f;
        }
        return objM17183e == null ? mo17185a() : objM17183e;
    }
}
