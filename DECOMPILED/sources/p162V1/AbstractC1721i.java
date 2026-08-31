package p162V1;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.AbstractC3208h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p155U1.InterfaceC1660c;
import p183Y1.AbstractC2022k;

/* JADX INFO: renamed from: V1.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1721i extends AbstractC1713a {

    /* JADX INFO: renamed from: f */
    private static boolean f5710f;

    /* JADX INFO: renamed from: r */
    private static int f5711r = AbstractC3208h.f13733a;

    /* JADX INFO: renamed from: a */
    protected final View f5712a;

    /* JADX INFO: renamed from: b */
    private final a f5713b;

    /* JADX INFO: renamed from: c */
    private View.OnAttachStateChangeListener f5714c;

    /* JADX INFO: renamed from: d */
    private boolean f5715d;

    /* JADX INFO: renamed from: e */
    private boolean f5716e;

    /* JADX INFO: renamed from: V1.i$a */
    static final class a {

        /* JADX INFO: renamed from: e */
        static Integer f5717e;

        /* JADX INFO: renamed from: a */
        private final View f5718a;

        /* JADX INFO: renamed from: b */
        private final List f5719b = new ArrayList();

        /* JADX INFO: renamed from: c */
        boolean f5720c;

        /* JADX INFO: renamed from: d */
        private ViewTreeObserverOnPreDrawListenerC7649a f5721d;

        /* JADX INFO: renamed from: V1.i$a$a, reason: collision with other inner class name */
        private static final class ViewTreeObserverOnPreDrawListenerC7649a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a */
            private final WeakReference f5722a;

            ViewTreeObserverOnPreDrawListenerC7649a(a aVar) {
                this.f5722a = new WeakReference(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = (a) this.f5722a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.m7334a();
                return true;
            }
        }

        a(View view) {
            this.f5718a = view;
        }

        /* JADX INFO: renamed from: c */
        private static int m7327c(Context context) {
            if (f5717e == null) {
                Display defaultDisplay = ((WindowManager) AbstractC2022k.m8408e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f5717e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f5717e.intValue();
        }

        /* JADX INFO: renamed from: e */
        private int m7328e(int i7, int i8, int i9) {
            int i10 = i8 - i9;
            if (i10 > 0) {
                return i10;
            }
            if (this.f5720c && this.f5718a.isLayoutRequested()) {
                return 0;
            }
            int i11 = i7 - i9;
            if (i11 > 0) {
                return i11;
            }
            if (this.f5718a.isLayoutRequested() || i8 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m7327c(this.f5718a.getContext());
        }

        /* JADX INFO: renamed from: f */
        private int m7329f() {
            int paddingTop = this.f5718a.getPaddingTop() + this.f5718a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f5718a.getLayoutParams();
            return m7328e(this.f5718a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* JADX INFO: renamed from: g */
        private int m7330g() {
            int paddingLeft = this.f5718a.getPaddingLeft() + this.f5718a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f5718a.getLayoutParams();
            return m7328e(this.f5718a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* JADX INFO: renamed from: h */
        private boolean m7331h(int i7) {
            return i7 > 0 || i7 == Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: i */
        private boolean m7332i(int i7, int i8) {
            return m7331h(i7) && m7331h(i8);
        }

        /* JADX INFO: renamed from: j */
        private void m7333j(int i7, int i8) {
            Iterator it = new ArrayList(this.f5719b).iterator();
            while (it.hasNext()) {
                ((InterfaceC1719g) it.next()).mo7023d(i7, i8);
            }
        }

        /* JADX INFO: renamed from: a */
        void m7334a() {
            if (this.f5719b.isEmpty()) {
                return;
            }
            int iM7330g = m7330g();
            int iM7329f = m7329f();
            if (m7332i(iM7330g, iM7329f)) {
                m7333j(iM7330g, iM7329f);
                m7335b();
            }
        }

        /* JADX INFO: renamed from: b */
        void m7335b() {
            ViewTreeObserver viewTreeObserver = this.f5718a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f5721d);
            }
            this.f5721d = null;
            this.f5719b.clear();
        }

        /* JADX INFO: renamed from: d */
        void m7336d(InterfaceC1719g interfaceC1719g) {
            int iM7330g = m7330g();
            int iM7329f = m7329f();
            if (m7332i(iM7330g, iM7329f)) {
                interfaceC1719g.mo7023d(iM7330g, iM7329f);
                return;
            }
            if (!this.f5719b.contains(interfaceC1719g)) {
                this.f5719b.add(interfaceC1719g);
            }
            if (this.f5721d == null) {
                ViewTreeObserver viewTreeObserver = this.f5718a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC7649a viewTreeObserverOnPreDrawListenerC7649a = new ViewTreeObserverOnPreDrawListenerC7649a(this);
                this.f5721d = viewTreeObserverOnPreDrawListenerC7649a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC7649a);
            }
        }

        /* JADX INFO: renamed from: k */
        void m7337k(InterfaceC1719g interfaceC1719g) {
            this.f5719b.remove(interfaceC1719g);
        }
    }

    public AbstractC1721i(View view) {
        this.f5712a = (View) AbstractC2022k.m8408e(view);
        this.f5713b = new a(view);
    }

    /* JADX INFO: renamed from: k */
    private Object m7323k() {
        return this.f5712a.getTag(f5711r);
    }

    /* JADX INFO: renamed from: l */
    private void m7324l() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f5714c;
        if (onAttachStateChangeListener == null || this.f5716e) {
            return;
        }
        this.f5712a.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f5716e = true;
    }

    /* JADX INFO: renamed from: m */
    private void m7325m() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f5714c;
        if (onAttachStateChangeListener == null || !this.f5716e) {
            return;
        }
        this.f5712a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f5716e = false;
    }

    /* JADX INFO: renamed from: n */
    private void m7326n(Object obj) {
        f5710f = true;
        this.f5712a.setTag(f5711r, obj);
    }

    @Override // p162V1.InterfaceC1720h
    /* JADX INFO: renamed from: b */
    public void mo7314b(InterfaceC1719g interfaceC1719g) {
        this.f5713b.m7337k(interfaceC1719g);
    }

    @Override // p162V1.InterfaceC1720h
    /* JADX INFO: renamed from: f */
    public void mo7315f(InterfaceC1660c interfaceC1660c) {
        m7326n(interfaceC1660c);
    }

    @Override // p162V1.AbstractC1713a, p162V1.InterfaceC1720h
    /* JADX INFO: renamed from: g */
    public void mo7311g(Drawable drawable) {
        super.mo7311g(drawable);
        m7324l();
    }

    @Override // p162V1.InterfaceC1720h
    /* JADX INFO: renamed from: h */
    public InterfaceC1660c mo7316h() {
        Object objM7323k = m7323k();
        if (objM7323k == null) {
            return null;
        }
        if (objM7323k instanceof InterfaceC1660c) {
            return (InterfaceC1660c) objM7323k;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // p162V1.AbstractC1713a, p162V1.InterfaceC1720h
    /* JADX INFO: renamed from: i */
    public void mo5243i(Drawable drawable) {
        super.mo5243i(drawable);
        this.f5713b.m7335b();
        if (this.f5715d) {
            return;
        }
        m7325m();
    }

    @Override // p162V1.InterfaceC1720h
    /* JADX INFO: renamed from: j */
    public void mo7317j(InterfaceC1719g interfaceC1719g) {
        this.f5713b.m7336d(interfaceC1719g);
    }

    public String toString() {
        return "Target for: " + this.f5712a;
    }
}
