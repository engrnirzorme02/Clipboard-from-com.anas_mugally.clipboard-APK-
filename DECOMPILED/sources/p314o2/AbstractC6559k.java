package p314o2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3380p1;
import com.google.android.gms.ads.internal.client.InterfaceC3318a;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbtt;
import p324p2.InterfaceC6738e;
import p404z2.AbstractC7586c;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: o2.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6559k extends ViewGroup {

    /* JADX INFO: renamed from: a */
    protected final C3380p1 f24760a;

    protected AbstractC6559k(Context context, int i7) {
        super(context);
        this.f24760a = new C3380p1(this, i7);
    }

    /* JADX INFO: renamed from: a */
    public void m27848a() {
        zzbci.zza(getContext());
        if (((Boolean) zzbeg.zze.zze()).booleanValue()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlU)).booleanValue()) {
                AbstractC7586c.f30234b.execute(new Runnable() { // from class: o2.G
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AbstractC6559k abstractC6559k = this.f24718a;
                        try {
                            abstractC6559k.f24760a.m17304h();
                        } catch (IllegalStateException e7) {
                            zzbtt.zza(abstractC6559k.getContext()).zzh(e7, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.f24760a.m17304h();
    }

    /* JADX INFO: renamed from: b */
    public void m27849b(final C6555g c6555g) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        zzbci.zza(getContext());
        if (((Boolean) zzbeg.zzf.zze()).booleanValue()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlX)).booleanValue()) {
                AbstractC7586c.f30234b.execute(new Runnable() { // from class: o2.D
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        C6555g c6555g2 = c6555g;
                        AbstractC6559k abstractC6559k = this.f24714a;
                        try {
                            abstractC6559k.f24760a.m17310n(c6555g2.f24739a);
                        } catch (IllegalStateException e7) {
                            zzbtt.zza(abstractC6559k.getContext()).zzh(e7, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.f24760a.m17310n(c6555g.f24739a);
    }

    /* JADX INFO: renamed from: c */
    public void m27850c() {
        zzbci.zza(getContext());
        if (((Boolean) zzbeg.zzg.zze()).booleanValue()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlV)).booleanValue()) {
                AbstractC7586c.f30234b.execute(new Runnable() { // from class: o2.E
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AbstractC6559k abstractC6559k = this.f24716a;
                        try {
                            abstractC6559k.f24760a.m17311o();
                        } catch (IllegalStateException e7) {
                            zzbtt.zza(abstractC6559k.getContext()).zzh(e7, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.f24760a.m17311o();
    }

    /* JADX INFO: renamed from: d */
    public void m27851d() {
        zzbci.zza(getContext());
        if (((Boolean) zzbeg.zzh.zze()).booleanValue()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlT)).booleanValue()) {
                AbstractC7586c.f30234b.execute(new Runnable() { // from class: o2.F
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AbstractC6559k abstractC6559k = this.f24717a;
                        try {
                            abstractC6559k.f24760a.m17312p();
                        } catch (IllegalStateException e7) {
                            zzbtt.zza(abstractC6559k.getContext()).zzh(e7, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.f24760a.m17312p();
    }

    public AbstractC6552d getAdListener() {
        return this.f24760a.m17305i();
    }

    public C6556h getAdSize() {
        return this.f24760a.m17306j();
    }

    public String getAdUnitId() {
        return this.f24760a.m17308l();
    }

    public InterfaceC6565q getOnPaidEventListener() {
        this.f24760a.m17296B();
        return null;
    }

    public long getPlacementId() {
        return this.f24760a.m17322z();
    }

    public C6571w getResponseInfo() {
        return this.f24760a.m17320x();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i11 = ((i9 - i7) - measuredWidth) / 2;
        int i12 = ((i10 - i8) - measuredHeight) / 2;
        childAt.layout(i11, i12, measuredWidth + i11, measuredHeight + i12);
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        C6556h adSize;
        int iM27828b;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e7) {
                AbstractC7599p.m33329d("Unable to retrieve ad size.", e7);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int iM27830d = adSize.m27830d(context);
                iM27828b = adSize.m27828b(context);
                measuredWidth = iM27830d;
            } else {
                iM27828b = 0;
            }
        } else {
            measureChild(childAt, i7, i8);
            measuredWidth = childAt.getMeasuredWidth();
            iM27828b = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i7), View.resolveSize(Math.max(iM27828b, getSuggestedMinimumHeight()), i8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(AbstractC6552d abstractC6552d) {
        C3380p1 c3380p1 = this.f24760a;
        c3380p1.m17313q(abstractC6552d);
        if (abstractC6552d == 0) {
            c3380p1.m17314r(null);
            return;
        }
        if (abstractC6552d instanceof InterfaceC3318a) {
            c3380p1.m17314r((InterfaceC3318a) abstractC6552d);
        }
        if (abstractC6552d instanceof InterfaceC6738e) {
            c3380p1.m17318v((InterfaceC6738e) abstractC6552d);
        }
    }

    public void setAdSize(C6556h c6556h) {
        this.f24760a.m17315s(c6556h);
    }

    public void setAdUnitId(String str) {
        this.f24760a.m17317u(str);
    }

    public void setOnPaidEventListener(InterfaceC6565q interfaceC6565q) {
        this.f24760a.m17321y(interfaceC6565q);
    }

    public void setPlacementId(long j7) {
        this.f24760a.m17295A(j7);
    }
}
