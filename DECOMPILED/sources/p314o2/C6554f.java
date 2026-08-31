package p314o2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.BinderC3267I1;
import com.google.android.gms.ads.internal.client.BinderC3317Z1;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3321a2;
import com.google.android.gms.ads.internal.client.C3365l2;
import com.google.android.gms.ads.internal.client.C3368m1;
import com.google.android.gms.ads.internal.client.InterfaceC3289Q;
import com.google.android.gms.ads.internal.client.InterfaceC3300U;
import com.google.android.gms.ads.nativead.C3521b;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbhw;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbot;
import com.google.android.gms.internal.ads.zzbsl;
import p340r2.C6887e;
import p340r2.InterfaceC6894l;
import p340r2.InterfaceC6895m;
import p340r2.InterfaceC6897o;
import p404z2.AbstractC7586c;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: o2.f */
/* JADX INFO: loaded from: classes.dex */
public class C6554f {

    /* JADX INFO: renamed from: a */
    private final C3365l2 f24734a;

    /* JADX INFO: renamed from: b */
    private final Context f24735b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC3289Q f24736c;

    /* JADX INFO: renamed from: o2.f$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final Context f24737a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC3300U f24738b;

        public a(Context context, String str) {
            Context context2 = (Context) AbstractC3718s.m18084m(context, "context cannot be null");
            InterfaceC3300U interfaceC3300UM17347c = C3244B.m17191b().m17347c(context, str, new zzbot());
            this.f24737a = context2;
            this.f24738b = interfaceC3300UM17347c;
        }

        /* JADX INFO: renamed from: a */
        public C6554f m27817a() {
            try {
                return new C6554f(this.f24737a, this.f24738b.zze(), C3365l2.f14001a);
            } catch (RemoteException e7) {
                AbstractC7599p.m33329d("Failed to build AdLoader.", e7);
                return new C6554f(this.f24737a, new BinderC3267I1().m17208L0(), C3365l2.f14001a);
            }
        }

        /* JADX INFO: renamed from: b */
        public a m27818b(NativeAd.InterfaceC3518c interfaceC3518c) {
            try {
                this.f24738b.zzm(new zzbsl(interfaceC3518c));
                return this;
            } catch (RemoteException e7) {
                AbstractC7599p.m33332g("Failed to add google native ad listener", e7);
                return this;
            }
        }

        /* JADX INFO: renamed from: c */
        public a m27819c(AbstractC6552d abstractC6552d) {
            try {
                this.f24738b.zzf(new BinderC3317Z1(abstractC6552d));
                return this;
            } catch (RemoteException e7) {
                AbstractC7599p.m33332g("Failed to set AdListener.", e7);
                return this;
            }
        }

        /* JADX INFO: renamed from: d */
        public a m27820d(C3521b c3521b) {
            try {
                this.f24738b.zzj(new zzbfl(4, c3521b.m17614e(), -1, c3521b.m17613d(), c3521b.m17610a(), c3521b.m17612c() != null ? new C3321a2(c3521b.m17612c()) : null, c3521b.m17615f(), c3521b.m17611b(), c3521b.m17616g(), c3521b.m17617h(), c3521b.m17618i() - 1));
                return this;
            } catch (RemoteException e7) {
                AbstractC7599p.m33332g("Failed to specify native ad options", e7);
                return this;
            }
        }

        /* JADX INFO: renamed from: e */
        public final a m27821e(InterfaceC6897o interfaceC6897o) {
            try {
                this.f24738b.zzm(new zzbhz(interfaceC6897o));
                return this;
            } catch (RemoteException e7) {
                AbstractC7599p.m33332g("Failed to add google native ad listener", e7);
                return this;
            }
        }

        /* JADX INFO: renamed from: f */
        public final a m27822f(String str, InterfaceC6895m interfaceC6895m, InterfaceC6894l interfaceC6894l) {
            zzbhw zzbhwVar = new zzbhw(interfaceC6895m, interfaceC6894l);
            try {
                this.f24738b.zzi(str, zzbhwVar.zza(), zzbhwVar.zzb());
                return this;
            } catch (RemoteException e7) {
                AbstractC7599p.m33332g("Failed to add custom template ad listener", e7);
                return this;
            }
        }

        /* JADX INFO: renamed from: g */
        public final a m27823g(C6887e c6887e) {
            try {
                this.f24738b.zzj(new zzbfl(c6887e));
                return this;
            } catch (RemoteException e7) {
                AbstractC7599p.m33332g("Failed to specify native ad options", e7);
                return this;
            }
        }
    }

    C6554f(Context context, InterfaceC3289Q interfaceC3289Q, C3365l2 c3365l2) {
        this.f24735b = context;
        this.f24736c = interfaceC3289Q;
        this.f24734a = c3365l2;
    }

    /* JADX INFO: renamed from: c */
    private final void m27814c(final C3368m1 c3368m1) {
        Context context = this.f24735b;
        zzbci.zza(context);
        if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlX)).booleanValue()) {
                AbstractC7586c.f30234b.execute(new Runnable() { // from class: o2.A
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f24711a.m27816b(c3368m1);
                    }
                });
                return;
            }
        }
        try {
            this.f24736c.zze(this.f24734a.m17269a(context, c3368m1));
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("Failed to load ad.", e7);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m27815a(C6555g c6555g) {
        m27814c(c6555g.f24739a);
    }

    /* JADX INFO: renamed from: b */
    final /* synthetic */ void m27816b(C3368m1 c3368m1) {
        try {
            this.f24736c.zze(this.f24734a.m17269a(this.f24735b, c3368m1));
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("Failed to load ad.", e7);
        }
    }
}
