package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.ads.internal.util.C3458X;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzayk implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    private static final long zzc = ((Long) C3250D.m17200c().zzd(zzbci.zzbA)).longValue();
    BroadcastReceiver zza;
    final WeakReference zzb;
    private final Context zzd;
    private Application zze;
    private final WindowManager zzf;
    private final PowerManager zzg;
    private final KeyguardManager zzh;
    private WeakReference zzi;
    private zzayw zzj;
    private final C3458X zzk = new C3458X(zzc);
    private boolean zzl = false;
    private int zzm = -1;
    private final HashSet zzn = new HashSet();
    private final DisplayMetrics zzo;
    private final Rect zzp;

    public zzayk(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.zzd = applicationContext;
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        this.zzf = windowManager;
        this.zzg = (PowerManager) applicationContext.getSystemService("power");
        this.zzh = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            this.zze = (Application) applicationContext;
            this.zzj = new zzayw((Application) applicationContext, this);
        }
        this.zzo = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.zzp = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.zzb;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            zzm(view2);
        }
        this.zzb = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                zzl(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final void zzh() {
        C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzayj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf();
            }
        });
    }

    private final void zzi(Activity activity, int i7) {
        Window window;
        WeakReference weakReference = this.zzb;
        if (weakReference == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.zzm = i7;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0133  */
    /* JADX WARN: Code duplicated, block: B:55:0x0138  */
    /* JADX WARN: Code duplicated, block: B:57:0x013c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0140  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zzj(int i7) {
        WeakReference weakReference;
        boolean globalVisibleRect;
        boolean localVisibleRect;
        View view;
        List arrayList;
        int i8;
        int i9;
        boolean z7;
        if (this.zzn.isEmpty() || (weakReference = this.zzb) == null) {
            return;
        }
        View view2 = (View) weakReference.get();
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view2 != null) {
            globalVisibleRect = view2.getGlobalVisibleRect(rect2);
            localVisibleRect = view2.getLocalVisibleRect(rect3);
            view2.getHitRect(rect4);
            try {
                view2.getLocationOnScreen(iArr);
                view2.getLocationInWindow(iArr2);
            } catch (Exception e7) {
                int i10 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("Failure getting view location.", e7);
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfB)).booleanValue()) {
                rect.left = iArr2[0];
                rect.top = iArr2[1];
            } else {
                rect.left = iArr[0];
                rect.top = iArr[1];
            }
            rect.right = rect.left + view2.getWidth();
            rect.bottom = rect.top + view2.getHeight();
            view = view2;
        } else {
            globalVisibleRect = false;
            localVisibleRect = false;
            view = null;
        }
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzbD)).booleanValue() || view == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            try {
                arrayList = new ArrayList();
                ViewParent parent = view.getParent();
                while (parent instanceof View) {
                    View view3 = (View) parent;
                    Rect rect5 = new Rect();
                    if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect5)) {
                        arrayList.add(zzc(rect5));
                    }
                    parent = parent.getParent();
                }
            } catch (Exception e8) {
                C7351t.m32354l().zzg(e8, "PositionWatcher.getParentScrollViewRects");
                arrayList = Collections.EMPTY_LIST;
            }
        }
        List list = arrayList;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i11 = this.zzm;
        if (i11 != -1) {
            windowVisibility = i11;
        }
        C7351t.m32349g();
        long jM17400a = C3431F0.m17400a(view);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlr)).booleanValue()) {
            if (view2 != null) {
                PowerManager powerManager = this.zzg;
                KeyguardManager keyguardManager = this.zzh;
                C7351t.m32349g();
                if (C3431F0.m17433x(view, powerManager, keyguardManager)) {
                    if (!globalVisibleRect) {
                        i8 = 0;
                        globalVisibleRect = false;
                    } else if (!localVisibleRect) {
                        globalVisibleRect = true;
                        i8 = 0;
                        localVisibleRect = false;
                    } else if (jM17400a < ((Integer) C3250D.m17200c().zzd(zzbci.zzlu)).intValue() || windowVisibility != 0) {
                        globalVisibleRect = true;
                        localVisibleRect = true;
                    } else {
                        i8 = 1;
                        globalVisibleRect = true;
                        localVisibleRect = true;
                        windowVisibility = 0;
                    }
                }
            }
            i8 = 0;
        } else {
            if (view2 != null) {
                PowerManager powerManager2 = this.zzg;
                KeyguardManager keyguardManager2 = this.zzh;
                C7351t.m32349g();
                if (C3431F0.m17433x(view, powerManager2, keyguardManager2)) {
                    if (!globalVisibleRect) {
                        i8 = 0;
                        globalVisibleRect = false;
                    } else if (!localVisibleRect) {
                        globalVisibleRect = true;
                        i8 = 0;
                        localVisibleRect = false;
                    } else if (windowVisibility == 0) {
                        i8 = 1;
                        globalVisibleRect = true;
                        localVisibleRect = true;
                        windowVisibility = 0;
                    } else {
                        globalVisibleRect = true;
                        localVisibleRect = true;
                    }
                }
            }
            i8 = 0;
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlw)).booleanValue()) {
            PowerManager powerManager3 = this.zzg;
            KeyguardManager keyguardManager3 = this.zzh;
            C7351t.m32349g();
            int i12 = true != C3431F0.m17433x(view, powerManager3, keyguardManager3) ? 0 : 64;
            int i13 = true != globalVisibleRect ? 0 : 8;
            int i14 = true != localVisibleRect ? 0 : 16;
            int i15 = windowVisibility == 0 ? 128 : 0;
            int i16 = jM17400a >= ((long) ((Integer) C3250D.m17200c().zzd(zzbci.zzlu)).intValue()) ? 32 : 0;
            C7351t.m32349g();
            C3431F0.m17423n(view, i16 | i15 | i12 | i13 | i14 | i8, null);
            i9 = 1;
        } else {
            i9 = 1;
        }
        if (i7 == i9 && !this.zzk.m17506a() && i8 == this.zzl) {
            return;
        }
        if (i8 != 0 || this.zzl) {
            z7 = true;
        } else {
            z7 = true;
            if (i7 == 1) {
                return;
            }
        }
        boolean z8 = i8;
        zzayh zzayhVar = new zzayh(C7351t.m32357o().mo18161c(), this.zzg.isScreenOn(), (view == null || !view.isAttachedToWindow()) ? false : z7, view != null ? view.getWindowVisibility() : 8, zzc(this.zzp), zzc(rect), zzc(rect2), globalVisibleRect, zzc(rect3), localVisibleRect, jM17400a, zzc(rect4), this.zzo.density, z8, list);
        Iterator it = this.zzn.iterator();
        while (it.hasNext()) {
            ((zzayi) it.next()).zzdo(zzayhVar);
        }
        this.zzl = z8;
    }

    private final int zzk(int i7) {
        return (int) (i7 / this.zzo.density);
    }

    private final void zzl(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzi = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zza == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.zza = new zzayg(this);
            C7351t.m32343a().m17531b(this.zzd, this.zza, intentFilter);
        }
        Application application = this.zze;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzj);
            } catch (Exception e7) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("Error registering activity lifecycle callbacks.", e7);
            }
        }
    }

    private final void zzm(View view) {
        try {
            WeakReference weakReference = this.zzi;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zzi = null;
            }
        } catch (Exception e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Error while unregistering listeners from the last ViewTreeObserver.", e7);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e8) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Error while unregistering listeners from the ViewTreeObserver.", e8);
        }
        if (this.zza != null) {
            try {
                C7351t.m32343a().m17532c(this.zzd, this.zza);
            } catch (IllegalStateException e9) {
                int i9 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("Failed trying to unregister the receiver", e9);
            } catch (Exception e10) {
                C7351t.m32354l().zzg(e10, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.zza = null;
        }
        Application application = this.zze;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zzj);
            } catch (Exception e11) {
                int i10 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("Error registering activity lifecycle callbacks.", e11);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzi(activity, 0);
        zzj(3);
        zzh();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zzj(3);
        zzh();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzi(activity, 4);
        zzj(3);
        zzh();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzi(activity, 0);
        zzj(3);
        zzh();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzj(3);
        zzh();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzi(activity, 0);
        zzj(3);
        zzh();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zzj(3);
        zzh();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzj(2);
        zzh();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzj(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzm = -1;
        zzl(view);
        zzj(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.zzm = -1;
        zzj(3);
        zzh();
        zzm(view);
    }

    public final void zza(zzayi zzayiVar) {
        this.zzn.add(zzayiVar);
        zzj(3);
    }

    public final void zzb(zzayi zzayiVar) {
        this.zzn.remove(zzayiVar);
    }

    final Rect zzc(Rect rect) {
        return new Rect(zzk(rect.left), zzk(rect.top), zzk(rect.right), zzk(rect.bottom));
    }

    public final void zzd(long j7) {
        this.zzk.m17507b(j7);
    }

    public final void zze() {
        this.zzk.m17507b(zzc);
    }

    final /* synthetic */ void zzf() {
        zzj(3);
    }

    final /* synthetic */ void zzg(int i7) {
        zzj(3);
    }
}
