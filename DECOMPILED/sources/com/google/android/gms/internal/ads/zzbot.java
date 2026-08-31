package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import p012B2.AbstractC0060a;
import p012B2.InterfaceC0065f;
import p020C2.InterfaceC0137a;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbot extends zzbow {
    @Override // com.google.android.gms.internal.ads.zzbox
    public final zzbpa zzb(String str) throws RemoteException {
        try {
            try {
                Class<?> cls = Class.forName(str, false, zzbot.class.getClassLoader());
                if (InterfaceC0065f.class.isAssignableFrom(cls)) {
                    return new zzbpy((InterfaceC0065f) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (AbstractC0060a.class.isAssignableFrom(cls)) {
                    return new zzbpy((AbstractC0060a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                AbstractC7599p.m33331f(sb.toString());
                throw new RemoteException();
            } catch (Throwable th) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
                sb2.append("Could not instantiate mediation adapter: ");
                sb2.append(str);
                sb2.append(". ");
                AbstractC7599p.m33332g(sb2.toString(), th);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            AbstractC7599p.m33326a("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new zzbpy(new AdMobAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new zzbpy(new CustomEventAdapter());
            }
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final boolean zzc(String str) {
        try {
            return InterfaceC0137a.class.isAssignableFrom(Class.forName(str, false, zzbot.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", trying Adapter implementation class.");
            AbstractC7599p.m33331f(sb.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final boolean zzd(String str) {
        try {
            return AbstractC0060a.class.isAssignableFrom(Class.forName(str, false, zzbot.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104);
            sb.append("Could not load custom event implementation class as Adapter: ");
            sb.append(str);
            sb.append(", assuming old custom event implementation.");
            AbstractC7599p.m33331f(sb.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final zzbqw zze(String str) throws RemoteException {
        try {
            return new zzbrj((RtbAdapter) Class.forName(str, false, zzbra.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }
}
