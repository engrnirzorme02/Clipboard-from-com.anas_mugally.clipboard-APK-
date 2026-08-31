package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.widget.C2455f;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p041F.AbstractC0400a;
import p111O.C1053i0;
import p255h.AbstractC5520a;
import p271j.AbstractC5822a;

/* JADX INFO: renamed from: androidx.appcompat.widget.N */
/* JADX INFO: loaded from: classes.dex */
class C2316N extends ListView {

    /* JADX INFO: renamed from: a */
    private final Rect f7930a;

    /* JADX INFO: renamed from: b */
    private int f7931b;

    /* JADX INFO: renamed from: c */
    private int f7932c;

    /* JADX INFO: renamed from: d */
    private int f7933d;

    /* JADX INFO: renamed from: e */
    private int f7934e;

    /* JADX INFO: renamed from: f */
    private int f7935f;

    /* JADX INFO: renamed from: r */
    private d f7936r;

    /* JADX INFO: renamed from: s */
    private boolean f7937s;

    /* JADX INFO: renamed from: t */
    private boolean f7938t;

    /* JADX INFO: renamed from: u */
    private boolean f7939u;

    /* JADX INFO: renamed from: v */
    private C1053i0 f7940v;

    /* JADX INFO: renamed from: w */
    private C2455f f7941w;

    /* JADX INFO: renamed from: x */
    f f7942x;

    /* JADX INFO: renamed from: androidx.appcompat.widget.N$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static void m9788a(View view, float f7, float f8) {
            view.drawableHotspotChanged(f7, f8);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.N$b */
    static class b {

        /* JADX INFO: renamed from: a */
        private static Method f7943a;

        /* JADX INFO: renamed from: b */
        private static Method f7944b;

        /* JADX INFO: renamed from: c */
        private static Method f7945c;

        /* JADX INFO: renamed from: d */
        private static boolean f7946d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f7943a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f7944b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f7945c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f7946d = true;
            } catch (NoSuchMethodException e7) {
                e7.printStackTrace();
            }
        }

        /* JADX INFO: renamed from: a */
        static boolean m9789a() {
            return f7946d;
        }

        /* JADX INFO: renamed from: b */
        static void m9790b(C2316N c2316n, int i7, View view) {
            try {
                f7943a.invoke(c2316n, Integer.valueOf(i7), view, Boolean.FALSE, -1, -1);
                f7944b.invoke(c2316n, Integer.valueOf(i7));
                f7945c.invoke(c2316n, Integer.valueOf(i7));
            } catch (IllegalAccessException e7) {
                e7.printStackTrace();
            } catch (InvocationTargetException e8) {
                e8.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.N$c */
    static class c {
        /* JADX INFO: renamed from: a */
        static boolean m9791a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        /* JADX INFO: renamed from: b */
        static void m9792b(AbsListView absListView, boolean z7) {
            absListView.setSelectedChildViewEnabled(z7);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.N$d */
    private static class d extends AbstractC5822a {

        /* JADX INFO: renamed from: b */
        private boolean f7947b;

        d(Drawable drawable) {
            super(drawable);
            this.f7947b = true;
        }

        /* JADX INFO: renamed from: b */
        void m9793b(boolean z7) {
            this.f7947b = z7;
        }

        @Override // p271j.AbstractC5822a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f7947b) {
                super.draw(canvas);
            }
        }

        @Override // p271j.AbstractC5822a, android.graphics.drawable.Drawable
        public void setHotspot(float f7, float f8) {
            if (this.f7947b) {
                super.setHotspot(f7, f8);
            }
        }

        @Override // p271j.AbstractC5822a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i7, int i8, int i9, int i10) {
            if (this.f7947b) {
                super.setHotspotBounds(i7, i8, i9, i10);
            }
        }

        @Override // p271j.AbstractC5822a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f7947b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p271j.AbstractC5822a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z7, boolean z8) {
            if (this.f7947b) {
                return super.setVisible(z7, z8);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.N$e */
    static class e {

        /* JADX INFO: renamed from: a */
        private static final Field f7948a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e7) {
                e7.printStackTrace();
            }
            f7948a = declaredField;
        }

        /* JADX INFO: renamed from: a */
        static boolean m9794a(AbsListView absListView) {
            Field field = f7948a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e7) {
                e7.printStackTrace();
                return false;
            }
        }

        /* JADX INFO: renamed from: b */
        static void m9795b(AbsListView absListView, boolean z7) {
            Field field = f7948a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z7));
                } catch (IllegalAccessException e7) {
                    e7.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.N$f */
    private class f implements Runnable {
        f() {
        }

        /* JADX INFO: renamed from: a */
        public void m9796a() {
            C2316N c2316n = C2316N.this;
            c2316n.f7942x = null;
            c2316n.removeCallbacks(this);
        }

        /* JADX INFO: renamed from: b */
        public void m9797b() {
            C2316N.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C2316N c2316n = C2316N.this;
            c2316n.f7942x = null;
            c2316n.drawableStateChanged();
        }
    }

    C2316N(Context context, boolean z7) {
        super(context, null, AbstractC5520a.f20988z);
        this.f7930a = new Rect();
        this.f7931b = 0;
        this.f7932c = 0;
        this.f7933d = 0;
        this.f7934e = 0;
        this.f7938t = z7;
        setCacheColorHint(0);
    }

    /* JADX INFO: renamed from: a */
    private void m9774a() {
        this.f7939u = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f7935f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C1053i0 c1053i0 = this.f7940v;
        if (c1053i0 != null) {
            c1053i0.m4685c();
            this.f7940v = null;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m9775b(View view, int i7) {
        performItemClick(view, i7, getItemIdAtPosition(i7));
    }

    /* JADX INFO: renamed from: c */
    private void m9776c(Canvas canvas) {
        Drawable selector;
        if (this.f7930a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f7930a);
        selector.draw(canvas);
    }

    /* JADX INFO: renamed from: f */
    private void m9777f(int i7, View view) {
        Rect rect = this.f7930a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f7931b;
        rect.top -= this.f7932c;
        rect.right += this.f7933d;
        rect.bottom += this.f7934e;
        boolean zM9782k = m9782k();
        if (view.isEnabled() != zM9782k) {
            m9783l(!zM9782k);
            if (i7 != -1) {
                refreshDrawableState();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private void m9778g(int i7, View view) {
        Drawable selector = getSelector();
        boolean z7 = (selector == null || i7 == -1) ? false : true;
        if (z7) {
            selector.setVisible(false, false);
        }
        m9777f(i7, view);
        if (z7) {
            Rect rect = this.f7930a;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            AbstractC0400a.m1705k(selector, fExactCenterX, fExactCenterY);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m9779h(int i7, View view, float f7, float f8) {
        m9778g(i7, view);
        Drawable selector = getSelector();
        if (selector == null || i7 == -1) {
            return;
        }
        AbstractC0400a.m1705k(selector, f7, f8);
    }

    /* JADX INFO: renamed from: i */
    private void m9780i(View view, int i7, float f7, float f8) {
        View childAt;
        this.f7939u = true;
        a.m9788a(this, f7, f8);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i8 = this.f7935f;
        if (i8 != -1 && (childAt = getChildAt(i8 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f7935f = i7;
        a.m9788a(view, f7 - view.getLeft(), f8 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m9779h(i7, view, f7, f8);
        m9781j(false);
        refreshDrawableState();
    }

    /* JADX INFO: renamed from: j */
    private void m9781j(boolean z7) {
        d dVar = this.f7936r;
        if (dVar != null) {
            dVar.m9793b(z7);
        }
    }

    /* JADX INFO: renamed from: k */
    private boolean m9782k() {
        return Build.VERSION.SDK_INT >= 33 ? c.m9791a(this) : e.m9794a(this);
    }

    /* JADX INFO: renamed from: l */
    private void m9783l(boolean z7) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.m9792b(this, z7);
        } else {
            e.m9795b(this, z7);
        }
    }

    /* JADX INFO: renamed from: m */
    private boolean m9784m() {
        return this.f7939u;
    }

    /* JADX INFO: renamed from: n */
    private void m9785n() {
        Drawable selector = getSelector();
        if (selector != null && m9784m() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* JADX INFO: renamed from: d */
    public int mo9786d(int i7, int i8, int i9, int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        View view = null;
        while (i12 < count) {
            int itemViewType = adapter.getItemViewType(i12);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            view = adapter.getView(i12, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i15 = layoutParams.height;
            view.measure(i7, i15 > 0 ? View.MeasureSpec.makeMeasureSpec(i15, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i12 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i10) {
                return (i11 < 0 || i12 <= i11 || i14 <= 0 || measuredHeight == i10) ? i10 : i14;
            }
            if (i11 >= 0 && i12 >= i11) {
                i14 = measuredHeight;
            }
            i12++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m9776c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f7942x != null) {
            return;
        }
        super.drawableStateChanged();
        m9781j(true);
        m9785n();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    /* JADX INFO: renamed from: e */
    public boolean mo9787e(MotionEvent motionEvent, int i7) {
        boolean z7;
        boolean z8;
        C2455f c2455f;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z7 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z7 = true;
                    z8 = false;
                } else {
                    z8 = false;
                    z7 = false;
                }
                if (z7 || z8) {
                    m9774a();
                }
                if (z7) {
                    c2455f = this.f7941w;
                    if (c2455f != null) {
                        c2455f.m10691m(false);
                    }
                    return z7;
                }
                if (this.f7941w == null) {
                    this.f7941w = new C2455f(this);
                }
                this.f7941w.m10691m(true);
                this.f7941w.onTouch(this, motionEvent);
                return z7;
            }
            z7 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i7);
        if (iFindPointerIndex < 0) {
            z8 = false;
            z7 = false;
        } else {
            int x7 = (int) motionEvent.getX(iFindPointerIndex);
            int y7 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x7, y7);
            if (iPointToPosition == -1) {
                z8 = true;
            } else {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                m9780i(childAt, iPointToPosition, x7, y7);
                if (actionMasked == 1) {
                    m9775b(childAt, iPointToPosition);
                }
                z7 = true;
                z8 = false;
            }
        }
        if (z7) {
            m9774a();
        } else {
            m9774a();
        }
        if (z7) {
            c2455f = this.f7941w;
            if (c2455f != null) {
                c2455f.m10691m(false);
            }
            return z7;
        }
        if (this.f7941w == null) {
            this.f7941w = new C2455f(this);
        }
        this.f7941w.m10691m(true);
        this.f7941w.onTouch(this, motionEvent);
        return z7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f7938t || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f7938t || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f7938t || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f7938t && this.f7937s) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f7942x = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i7 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f7942x == null) {
            f fVar = new f();
            this.f7942x = fVar;
            fVar.m9797b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i7 < 30 || !b.m9789a()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    b.m9790b(this, iPointToPosition, childAt);
                }
            }
            m9785n();
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f7935f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f7942x;
        if (fVar != null) {
            fVar.m9796a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z7) {
        this.f7937s = z7;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f7936r = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f7931b = rect.left;
        this.f7932c = rect.top;
        this.f7933d = rect.right;
        this.f7934e = rect.bottom;
    }
}
