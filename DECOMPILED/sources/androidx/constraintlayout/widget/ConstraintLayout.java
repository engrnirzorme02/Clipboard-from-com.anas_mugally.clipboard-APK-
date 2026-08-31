package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AbstractC2263x;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.internal.ads.zzbbn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p361u.AbstractC7147e;
import p385x.AbstractC7376k;
import p385x.AbstractC7377l;
import p385x.C7369d;
import p385x.C7370e;
import p385x.C7371f;
import p385x.C7373h;
import p393y.C7431b;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: J */
    private static C2419j f8517J;

    /* JADX INFO: renamed from: A */
    int f8518A;

    /* JADX INFO: renamed from: B */
    int f8519B;

    /* JADX INFO: renamed from: C */
    int f8520C;

    /* JADX INFO: renamed from: D */
    int f8521D;

    /* JADX INFO: renamed from: E */
    private SparseArray f8522E;

    /* JADX INFO: renamed from: F */
    C2409c f8523F;

    /* JADX INFO: renamed from: G */
    private int f8524G;

    /* JADX INFO: renamed from: H */
    private int f8525H;

    /* JADX INFO: renamed from: I */
    private ArrayList f8526I;

    /* JADX INFO: renamed from: a */
    SparseArray f8527a;

    /* JADX INFO: renamed from: b */
    private ArrayList f8528b;

    /* JADX INFO: renamed from: c */
    protected C7371f f8529c;

    /* JADX INFO: renamed from: d */
    private int f8530d;

    /* JADX INFO: renamed from: e */
    private int f8531e;

    /* JADX INFO: renamed from: f */
    private int f8532f;

    /* JADX INFO: renamed from: r */
    private int f8533r;

    /* JADX INFO: renamed from: s */
    protected boolean f8534s;

    /* JADX INFO: renamed from: t */
    private int f8535t;

    /* JADX INFO: renamed from: u */
    private C2414e f8536u;

    /* JADX INFO: renamed from: v */
    protected C2413d f8537v;

    /* JADX INFO: renamed from: w */
    private int f8538w;

    /* JADX INFO: renamed from: x */
    private HashMap f8539x;

    /* JADX INFO: renamed from: y */
    private int f8540y;

    /* JADX INFO: renamed from: z */
    private int f8541z;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    static /* synthetic */ class C2407a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f8542a;

        static {
            int[] iArr = new int[C7370e.b.values().length];
            f8542a = iArr;
            try {
                iArr[C7370e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8542a[C7370e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8542a[C7370e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8542a[C7370e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$c */
    class C2409c implements C7431b.b {

        /* JADX INFO: renamed from: a */
        ConstraintLayout f8619a;

        /* JADX INFO: renamed from: b */
        int f8620b;

        /* JADX INFO: renamed from: c */
        int f8621c;

        /* JADX INFO: renamed from: d */
        int f8622d;

        /* JADX INFO: renamed from: e */
        int f8623e;

        /* JADX INFO: renamed from: f */
        int f8624f;

        /* JADX INFO: renamed from: g */
        int f8625g;

        C2409c(ConstraintLayout constraintLayout) {
            this.f8619a = constraintLayout;
        }

        /* JADX INFO: renamed from: d */
        private boolean m10377d(int i7, int i8, int i9) {
            if (i7 == i8) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i7);
            int mode2 = View.MeasureSpec.getMode(i8);
            int size = View.MeasureSpec.getSize(i8);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i9 == size;
            }
            return false;
        }

        @Override // p393y.C7431b.b
        /* JADX INFO: renamed from: a */
        public final void mo10378a() {
            int childCount = this.f8619a.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                this.f8619a.getChildAt(i7);
            }
            int size = this.f8619a.f8528b.size();
            if (size > 0) {
                for (int i8 = 0; i8 < size; i8++) {
                    ((AbstractC2412c) this.f8619a.f8528b.get(i8)).m10396l(this.f8619a);
                }
            }
        }

        @Override // p393y.C7431b.b
        /* JADX INFO: renamed from: b */
        public final void mo10379b(C7370e c7370e, C7431b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int iMax2;
            int i7;
            if (c7370e == null) {
                return;
            }
            if (c7370e.m32506V() == 8 && !c7370e.m32536j0()) {
                aVar.f29766e = 0;
                aVar.f29767f = 0;
                aVar.f29768g = 0;
                return;
            }
            if (c7370e.m32486K() == null) {
                return;
            }
            ConstraintLayout.m10356b(ConstraintLayout.this);
            C7370e.b bVar = aVar.f29762a;
            C7370e.b bVar2 = aVar.f29763b;
            int i8 = aVar.f29764c;
            int i9 = aVar.f29765d;
            int i10 = this.f8620b + this.f8621c;
            int i11 = this.f8622d;
            View view = (View) c7370e.m32560s();
            int[] iArr = C2407a.f8542a;
            int i12 = iArr[bVar.ordinal()];
            if (i12 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
            } else if (i12 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f8624f, i11, -2);
            } else if (i12 == 3) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f8624f, i11 + c7370e.m32468B(), -1);
            } else if (i12 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f8624f, i11, -2);
                boolean z7 = c7370e.f29468w == 1;
                int i13 = aVar.f29771j;
                if (i13 == C7431b.a.f29760l || i13 == C7431b.a.f29761m) {
                    boolean z8 = view.getMeasuredHeight() == c7370e.m32570x();
                    if (aVar.f29771j == C7431b.a.f29761m || !z7 || ((z7 && z8) || c7370e.mo32423n0())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c7370e.m32508W(), 1073741824);
                    }
                }
            }
            int i14 = iArr[bVar2.ordinal()];
            if (i14 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
            } else if (i14 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f8625g, i10, -2);
            } else if (i14 == 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f8625g, i10 + c7370e.m32504U(), -1);
            } else if (i14 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f8625g, i10, -2);
                boolean z9 = c7370e.f29470x == 1;
                int i15 = aVar.f29771j;
                if (i15 == C7431b.a.f29760l || i15 == C7431b.a.f29761m) {
                    boolean z10 = view.getMeasuredWidth() == c7370e.m32508W();
                    if (aVar.f29771j == C7431b.a.f29761m || !z9 || ((z9 && z10) || c7370e.mo32424o0())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c7370e.m32570x(), 1073741824);
                    }
                }
            }
            C7371f c7371f = (C7371f) c7370e.m32486K();
            if (c7371f != null && AbstractC7376k.m32681b(ConstraintLayout.this.f8535t, 256) && view.getMeasuredWidth() == c7370e.m32508W() && view.getMeasuredWidth() < c7371f.m32508W() && view.getMeasuredHeight() == c7370e.m32570x() && view.getMeasuredHeight() < c7371f.m32570x() && view.getBaseline() == c7370e.m32551p() && !c7370e.m32545m0() && m10377d(c7370e.m32470C(), iMakeMeasureSpec, c7370e.m32508W()) && m10377d(c7370e.m32472D(), iMakeMeasureSpec2, c7370e.m32570x())) {
                aVar.f29766e = c7370e.m32508W();
                aVar.f29767f = c7370e.m32570x();
                aVar.f29768g = c7370e.m32551p();
                return;
            }
            C7370e.b bVar3 = C7370e.b.MATCH_CONSTRAINT;
            boolean z11 = bVar == bVar3;
            boolean z12 = bVar2 == bVar3;
            C7370e.b bVar4 = C7370e.b.MATCH_PARENT;
            boolean z13 = bVar2 == bVar4 || bVar2 == C7370e.b.FIXED;
            boolean z14 = bVar == bVar4 || bVar == C7370e.b.FIXED;
            boolean z15 = z11 && c7370e.f29431d0 > 0.0f;
            boolean z16 = z12 && c7370e.f29431d0 > 0.0f;
            if (view == null) {
                return;
            }
            C2408b c2408b = (C2408b) view.getLayoutParams();
            int i16 = aVar.f29771j;
            if (i16 != C7431b.a.f29760l && i16 != C7431b.a.f29761m && z11 && c7370e.f29468w == 0 && z12 && c7370e.f29470x == 0) {
                i7 = -1;
                iMax2 = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof AbstractC2420k) && (c7370e instanceof AbstractC7377l)) {
                    ((AbstractC2420k) view).mo10353p((AbstractC7377l) c7370e, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                c7370e.m32509W0(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i17 = c7370e.f29474z;
                iMax = i17 > 0 ? Math.max(i17, measuredWidth) : measuredWidth;
                int i18 = c7370e.f29388A;
                if (i18 > 0) {
                    iMax = Math.min(i18, iMax);
                }
                int i19 = c7370e.f29392C;
                iMax2 = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
                boolean z17 = z14;
                int i20 = c7370e.f29394D;
                if (i20 > 0) {
                    iMax2 = Math.min(i20, iMax2);
                }
                boolean z18 = z13;
                if (!AbstractC7376k.m32681b(ConstraintLayout.this.f8535t, 1)) {
                    if (z15 && z18) {
                        iMax = (int) ((iMax2 * c7370e.f29431d0) + 0.5f);
                    } else if (z16 && z17) {
                        iMax2 = (int) ((iMax / c7370e.f29431d0) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight != iMax2) {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    }
                    if (measuredHeight != iMax2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    c7370e.m32509W0(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = view.getMeasuredWidth();
                    iMax2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i7 = -1;
            }
            boolean z19 = baseline != i7;
            aVar.f29770i = (iMax == aVar.f29764c && iMax2 == aVar.f29765d) ? false : true;
            if (c2408b.f8582g0) {
                z19 = true;
            }
            if (z19 && baseline != -1 && c7370e.m32551p() != baseline) {
                aVar.f29770i = true;
            }
            aVar.f29766e = iMax;
            aVar.f29767f = iMax2;
            aVar.f29769h = z19;
            aVar.f29768g = baseline;
            ConstraintLayout.m10356b(ConstraintLayout.this);
        }

        /* JADX INFO: renamed from: c */
        public void m10380c(int i7, int i8, int i9, int i10, int i11, int i12) {
            this.f8620b = i9;
            this.f8621c = i10;
            this.f8622d = i11;
            this.f8623e = i12;
            this.f8624f = i7;
            this.f8625g = i8;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8527a = new SparseArray();
        this.f8528b = new ArrayList(4);
        this.f8529c = new C7371f();
        this.f8530d = 0;
        this.f8531e = 0;
        this.f8532f = C3553a.e.API_PRIORITY_OTHER;
        this.f8533r = C3553a.e.API_PRIORITY_OTHER;
        this.f8534s = true;
        this.f8535t = 257;
        this.f8536u = null;
        this.f8537v = null;
        this.f8538w = -1;
        this.f8539x = new HashMap();
        this.f8540y = -1;
        this.f8541z = -1;
        this.f8518A = -1;
        this.f8519B = -1;
        this.f8520C = 0;
        this.f8521D = 0;
        this.f8522E = new SparseArray();
        this.f8523F = new C2409c(this);
        this.f8524G = 0;
        this.f8525H = 0;
        m10360s(attributeSet, 0, 0);
    }

    /* JADX INFO: renamed from: B */
    private void m10354B(C7370e c7370e, C2408b c2408b, SparseArray sparseArray, int i7, C7369d.a aVar) {
        View view = (View) this.f8527a.get(i7);
        C7370e c7370e2 = (C7370e) sparseArray.get(i7);
        if (c7370e2 == null || view == null || !(view.getLayoutParams() instanceof C2408b)) {
            return;
        }
        c2408b.f8582g0 = true;
        C7369d.a aVar2 = C7369d.a.BASELINE;
        if (aVar == aVar2) {
            C2408b c2408b2 = (C2408b) view.getLayoutParams();
            c2408b2.f8582g0 = true;
            c2408b2.f8612v0.m32489L0(true);
        }
        c7370e.mo32549o(aVar2).m32437b(c7370e2.mo32549o(aVar), c2408b.f8546D, c2408b.f8545C, true);
        c7370e.m32489L0(true);
        c7370e.mo32549o(C7369d.a.TOP).m32452q();
        c7370e.mo32549o(C7369d.a.BOTTOM).m32452q();
    }

    /* JADX INFO: renamed from: C */
    private boolean m10355C() {
        int childCount = getChildCount();
        boolean z7 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            if (getChildAt(i7).isLayoutRequested()) {
                z7 = true;
                break;
            }
        }
        if (z7) {
            m10362y();
        }
        return z7;
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ AbstractC7147e m10356b(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        return null;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static C2419j getSharedValues() {
        if (f8517J == null) {
            f8517J = new C2419j();
        }
        return f8517J;
    }

    /* JADX INFO: renamed from: p */
    private C7370e m10359p(int i7) {
        if (i7 == 0) {
            return this.f8529c;
        }
        View viewFindViewById = (View) this.f8527a.get(i7);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i7)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f8529c;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((C2408b) viewFindViewById.getLayoutParams()).f8612v0;
    }

    /* JADX INFO: renamed from: s */
    private void m10360s(AttributeSet attributeSet, int i7, int i8) {
        this.f8529c.m32471C0(this);
        this.f8529c.m32598X1(this.f8523F);
        this.f8527a.put(getId(), this);
        this.f8536u = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2418i.f8975V0, i7, i8);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i9 = 0; i9 < indexCount; i9++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i9);
                if (index == AbstractC2418i.f9058f1) {
                    this.f8530d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8530d);
                } else if (index == AbstractC2418i.f9066g1) {
                    this.f8531e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8531e);
                } else if (index == AbstractC2418i.f9042d1) {
                    this.f8532f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8532f);
                } else if (index == AbstractC2418i.f9050e1) {
                    this.f8533r = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8533r);
                } else if (index == AbstractC2418i.f8921O2) {
                    this.f8535t = typedArrayObtainStyledAttributes.getInt(index, this.f8535t);
                } else if (index == AbstractC2418i.f8880J1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m10372v(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f8537v = null;
                        }
                    }
                } else if (index == AbstractC2418i.f9122n1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C2414e c2414e = new C2414e();
                        this.f8536u = c2414e;
                        c2414e.m10420k(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f8536u = null;
                    }
                    this.f8538w = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f8529c.m32599Y1(this.f8535t);
    }

    /* JADX INFO: renamed from: u */
    private void m10361u() {
        this.f8534s = true;
        this.f8540y = -1;
        this.f8541z = -1;
        this.f8518A = -1;
        this.f8519B = -1;
        this.f8520C = 0;
        this.f8521D = 0;
    }

    /* JADX INFO: renamed from: y */
    private void m10362y() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            C7370e c7370eM10370r = m10370r(getChildAt(i7));
            if (c7370eM10370r != null) {
                c7370eM10370r.mo32563t0();
            }
        }
        if (zIsInEditMode) {
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    m10375z(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    m10359p(childAt.getId()).m32473D0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f8538w != -1) {
            for (int i9 = 0; i9 < childCount; i9++) {
                getChildAt(i9).getId();
            }
        }
        C2414e c2414e = this.f8536u;
        if (c2414e != null) {
            c2414e.m10416d(this, true);
        }
        this.f8529c.m32706v1();
        int size = this.f8528b.size();
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC2412c) this.f8528b.get(i10)).m10398n(this);
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            getChildAt(i11);
        }
        this.f8522E.clear();
        this.f8522E.put(0, this.f8529c);
        this.f8522E.put(getId(), this.f8529c);
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            this.f8522E.put(childAt2.getId(), m10370r(childAt2));
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt3 = getChildAt(i13);
            C7370e c7370eM10370r2 = m10370r(childAt3);
            if (c7370eM10370r2 != null) {
                C2408b c2408b = (C2408b) childAt3.getLayoutParams();
                this.f8529c.m32703c(c7370eM10370r2);
                m10364e(zIsInEditMode, childAt3, c7370eM10370r2, c2408b, this.f8522E);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 x.e$b) = (r2v3 x.e$b), (r2v0 x.e$b) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: A */
    protected void m10363A(C7371f c7371f, int i7, int i8, int i9, int i10) {
        C7370e.b bVar;
        C2409c c2409c = this.f8523F;
        int i11 = c2409c.f8623e;
        int i12 = c2409c.f8622d;
        C7370e.b bVar2 = C7370e.b.FIXED;
        int childCount = getChildCount();
        if (i7 == Integer.MIN_VALUE) {
            bVar = C7370e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i8 = Math.max(0, this.f8530d);
            }
        } else if (i7 == 0) {
            bVar = C7370e.b.WRAP_CONTENT;
            i8 = childCount == 0 ? Math.max(0, this.f8530d) : 0;
        } else if (i7 != 1073741824) {
            bVar = bVar2;
        } else {
            i8 = Math.min(this.f8532f - i12, i8);
            bVar = bVar2;
        }
        if (i9 == Integer.MIN_VALUE) {
            bVar2 = C7370e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i10 = Math.max(0, this.f8531e);
            }
        } else if (i9 == 0) {
            bVar2 = C7370e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i10 = Math.max(0, this.f8531e);
            } else {
                i10 = 0;
            }
        } else if (i9 != 1073741824) {
            i10 = 0;
        } else {
            i10 = Math.min(this.f8533r - i11, i10);
        }
        if (i8 != c7371f.m32508W() || i10 != c7371f.m32570x()) {
            c7371f.m32592P1();
        }
        c7371f.m32548n1(0);
        c7371f.m32550o1(0);
        c7371f.m32513Y0(this.f8532f - i12);
        c7371f.m32511X0(this.f8533r - i11);
        c7371f.m32519b1(0);
        c7371f.m32517a1(0);
        c7371f.m32497Q0(bVar);
        c7371f.m32543l1(i8);
        c7371f.m32532h1(bVar2);
        c7371f.m32491M0(i10);
        c7371f.m32519b1(this.f8530d - i12);
        c7371f.m32517a1(this.f8531e - i11);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2408b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f8528b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                ((AbstractC2412c) this.f8528b.get(i7)).m10397m(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i9 = Integer.parseInt(strArrSplit[0]);
                        int i10 = Integer.parseInt(strArrSplit[1]);
                        int i11 = Integer.parseInt(strArrSplit[2]);
                        int i12 = (int) ((i9 / 1080.0f) * width);
                        int i13 = (int) ((i10 / 1920.0f) * height);
                        int i14 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f7 = i12;
                        float f8 = i13;
                        float f9 = i12 + ((int) ((i11 / 1080.0f) * width));
                        canvas.drawLine(f7, f8, f9, f8, paint);
                        float f10 = i13 + i14;
                        canvas.drawLine(f9, f8, f9, f10, paint);
                        canvas.drawLine(f9, f10, f7, f10, paint);
                        canvas.drawLine(f7, f10, f7, f8, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f7, f8, f9, f10, paint);
                        canvas.drawLine(f7, f10, f9, f8, paint);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0174  */
    /* JADX WARN: Code duplicated, block: B:78:0x017d  */
    /* JADX INFO: renamed from: e */
    protected void m10364e(boolean z7, View view, C7370e c7370e, C2408b c2408b, SparseArray sparseArray) {
        C7370e c7370e2;
        C7370e c7370e3;
        C7370e c7370e4;
        C7370e c7370e5;
        C2408b c2408b2;
        C7370e c7370e6;
        float f7;
        int i7;
        c2408b.m10376a();
        c2408b.f8614w0 = false;
        c7370e.m32540k1(view.getVisibility());
        if (c2408b.f8588j0) {
            c7370e.m32505U0(true);
            c7370e.m32540k1(8);
        }
        c7370e.m32471C0(view);
        if (view instanceof AbstractC2412c) {
            ((AbstractC2412c) view).mo10352j(c7370e, this.f8529c.m32594R1());
        }
        if (c2408b.f8584h0) {
            C7373h c7373h = (C7373h) c7370e;
            int i8 = c2408b.f8606s0;
            int i9 = c2408b.f8608t0;
            float f8 = c2408b.f8610u0;
            if (f8 != -1.0f) {
                c7373h.m32665A1(f8);
                return;
            } else if (i8 != -1) {
                c7373h.m32673y1(i8);
                return;
            } else {
                if (i9 != -1) {
                    c7373h.m32674z1(i9);
                    return;
                }
                return;
            }
        }
        int i10 = c2408b.f8592l0;
        int i11 = c2408b.f8594m0;
        int i12 = c2408b.f8596n0;
        int i13 = c2408b.f8598o0;
        int i14 = c2408b.f8600p0;
        int i15 = c2408b.f8602q0;
        float f9 = c2408b.f8604r0;
        int i16 = c2408b.f8599p;
        if (i16 != -1) {
            C7370e c7370e7 = (C7370e) sparseArray.get(i16);
            if (c7370e7 != null) {
                c7370e.m32541l(c7370e7, c2408b.f8603r, c2408b.f8601q);
            }
            c7370e6 = c7370e;
            c2408b2 = c2408b;
        } else {
            if (i10 != -1) {
                C7370e c7370e8 = (C7370e) sparseArray.get(i10);
                if (c7370e8 != null) {
                    C7369d.a aVar = C7369d.a.LEFT;
                    c7370e.m32525e0(aVar, c7370e8, aVar, ((ViewGroup.MarginLayoutParams) c2408b).leftMargin, i14);
                }
            } else if (i11 != -1 && (c7370e2 = (C7370e) sparseArray.get(i11)) != null) {
                c7370e.m32525e0(C7369d.a.LEFT, c7370e2, C7369d.a.RIGHT, ((ViewGroup.MarginLayoutParams) c2408b).leftMargin, i14);
            }
            if (i12 != -1) {
                C7370e c7370e9 = (C7370e) sparseArray.get(i12);
                if (c7370e9 != null) {
                    c7370e.m32525e0(C7369d.a.RIGHT, c7370e9, C7369d.a.LEFT, ((ViewGroup.MarginLayoutParams) c2408b).rightMargin, i15);
                }
            } else if (i13 != -1 && (c7370e3 = (C7370e) sparseArray.get(i13)) != null) {
                C7369d.a aVar2 = C7369d.a.RIGHT;
                c7370e.m32525e0(aVar2, c7370e3, aVar2, ((ViewGroup.MarginLayoutParams) c2408b).rightMargin, i15);
            }
            int i17 = c2408b.f8585i;
            if (i17 != -1) {
                C7370e c7370e10 = (C7370e) sparseArray.get(i17);
                if (c7370e10 != null) {
                    C7369d.a aVar3 = C7369d.a.TOP;
                    c7370e.m32525e0(aVar3, c7370e10, aVar3, ((ViewGroup.MarginLayoutParams) c2408b).topMargin, c2408b.f8615x);
                }
            } else {
                int i18 = c2408b.f8587j;
                if (i18 != -1 && (c7370e4 = (C7370e) sparseArray.get(i18)) != null) {
                    c7370e.m32525e0(C7369d.a.TOP, c7370e4, C7369d.a.BOTTOM, ((ViewGroup.MarginLayoutParams) c2408b).topMargin, c2408b.f8615x);
                }
            }
            int i19 = c2408b.f8589k;
            if (i19 != -1) {
                C7370e c7370e11 = (C7370e) sparseArray.get(i19);
                if (c7370e11 != null) {
                    c7370e.m32525e0(C7369d.a.BOTTOM, c7370e11, C7369d.a.TOP, ((ViewGroup.MarginLayoutParams) c2408b).bottomMargin, c2408b.f8617z);
                }
            } else {
                int i20 = c2408b.f8591l;
                if (i20 != -1 && (c7370e5 = (C7370e) sparseArray.get(i20)) != null) {
                    C7369d.a aVar4 = C7369d.a.BOTTOM;
                    c7370e.m32525e0(aVar4, c7370e5, aVar4, ((ViewGroup.MarginLayoutParams) c2408b).bottomMargin, c2408b.f8617z);
                }
            }
            int i21 = c2408b.f8593m;
            if (i21 != -1) {
                c2408b2 = c2408b;
                m10354B(c7370e, c2408b2, sparseArray, i21, C7369d.a.BASELINE);
            } else {
                c2408b2 = c2408b;
                int i22 = c2408b2.f8595n;
                if (i22 != -1) {
                    m10354B(c7370e, c2408b2, sparseArray, i22, C7369d.a.TOP);
                } else {
                    int i23 = c2408b2.f8597o;
                    if (i23 != -1) {
                        m10354B(c7370e, c2408b2, sparseArray, i23, C7369d.a.BOTTOM);
                        c7370e6 = c7370e;
                    }
                    if (f9 >= 0.0f) {
                        c7370e6.m32493N0(f9);
                    }
                    f7 = c2408b2.f8550H;
                    if (f7 >= 0.0f) {
                        c7370e6.m32526e1(f7);
                    }
                }
            }
            c7370e6 = c7370e;
            if (f9 >= 0.0f) {
                c7370e6.m32493N0(f9);
            }
            f7 = c2408b2.f8550H;
            if (f7 >= 0.0f) {
                c7370e6.m32526e1(f7);
            }
        }
        if (z7 && ((i7 = c2408b2.f8566X) != -1 || c2408b2.f8567Y != -1)) {
            c7370e6.m32521c1(i7, c2408b2.f8567Y);
        }
        if (c2408b2.f8578e0) {
            c7370e6.m32497Q0(C7370e.b.FIXED);
            c7370e6.m32543l1(((ViewGroup.MarginLayoutParams) c2408b2).width);
            if (((ViewGroup.MarginLayoutParams) c2408b2).width == -2) {
                c7370e6.m32497Q0(C7370e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) c2408b2).width == -1) {
            if (c2408b2.f8570a0) {
                c7370e6.m32497Q0(C7370e.b.MATCH_CONSTRAINT);
            } else {
                c7370e6.m32497Q0(C7370e.b.MATCH_PARENT);
            }
            c7370e6.mo32549o(C7369d.a.LEFT).f29374g = ((ViewGroup.MarginLayoutParams) c2408b2).leftMargin;
            c7370e6.mo32549o(C7369d.a.RIGHT).f29374g = ((ViewGroup.MarginLayoutParams) c2408b2).rightMargin;
        } else {
            c7370e6.m32497Q0(C7370e.b.MATCH_CONSTRAINT);
            c7370e6.m32543l1(0);
        }
        if (c2408b2.f8580f0) {
            c7370e6.m32532h1(C7370e.b.FIXED);
            c7370e6.m32491M0(((ViewGroup.MarginLayoutParams) c2408b2).height);
            if (((ViewGroup.MarginLayoutParams) c2408b2).height == -2) {
                c7370e6.m32532h1(C7370e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) c2408b2).height == -1) {
            if (c2408b2.f8572b0) {
                c7370e6.m32532h1(C7370e.b.MATCH_CONSTRAINT);
            } else {
                c7370e6.m32532h1(C7370e.b.MATCH_PARENT);
            }
            c7370e6.mo32549o(C7369d.a.TOP).f29374g = ((ViewGroup.MarginLayoutParams) c2408b2).topMargin;
            c7370e6.mo32549o(C7369d.a.BOTTOM).f29374g = ((ViewGroup.MarginLayoutParams) c2408b2).bottomMargin;
        } else {
            c7370e6.m32532h1(C7370e.b.MATCH_CONSTRAINT);
            c7370e6.m32491M0(0);
        }
        c7370e6.m32475E0(c2408b2.f8551I);
        c7370e6.m32501S0(c2408b2.f8554L);
        c7370e6.m32537j1(c2408b2.f8555M);
        c7370e6.m32495O0(c2408b2.f8556N);
        c7370e6.m32528f1(c2408b2.f8557O);
        c7370e6.m32546m1(c2408b2.f8576d0);
        c7370e6.m32499R0(c2408b2.f8558P, c2408b2.f8560R, c2408b2.f8562T, c2408b2.f8564V);
        c7370e6.m32534i1(c2408b2.f8559Q, c2408b2.f8561S, c2408b2.f8563U, c2408b2.f8565W);
    }

    /* JADX INFO: renamed from: f */
    protected boolean m10365f(int i7, int i8) {
        if (this.f8526I == null) {
            return false;
        }
        View.MeasureSpec.getSize(i7);
        View.MeasureSpec.getSize(i8);
        Iterator it = this.f8526I.iterator();
        while (it.hasNext()) {
            AbstractC2263x.m9328a(it.next());
            Iterator it2 = this.f8529c.m32704s1().iterator();
            if (it2.hasNext()) {
                View view = (View) ((C7370e) it2.next()).m32560s();
                view.getId();
                throw null;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void forceLayout() {
        m10361u();
        super.forceLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C2408b generateDefaultLayoutParams() {
        return new C2408b(-2, -2);
    }

    public int getMaxHeight() {
        return this.f8533r;
    }

    public int getMaxWidth() {
        return this.f8532f;
    }

    public int getMinHeight() {
        return this.f8531e;
    }

    public int getMinWidth() {
        return this.f8530d;
    }

    public int getOptimizationLevel() {
        return this.f8529c.m32588L1();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.f8529c.f29452o == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.f8529c.f29452o = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.f8529c.f29452o = "parent";
            }
        }
        if (this.f8529c.m32562t() == null) {
            C7371f c7371f = this.f8529c;
            c7371f.m32473D0(c7371f.f29452o);
            Log.v("ConstraintLayout", " setDebugName " + this.f8529c.m32562t());
        }
        for (C7370e c7370e : this.f8529c.m32704s1()) {
            View view = (View) c7370e.m32560s();
            if (view != null) {
                if (c7370e.f29452o == null && (id = view.getId()) != -1) {
                    c7370e.f29452o = getContext().getResources().getResourceEntryName(id);
                }
                if (c7370e.m32562t() == null) {
                    c7370e.m32473D0(c7370e.f29452o);
                    Log.v("ConstraintLayout", " setDebugName " + c7370e.m32562t());
                }
            }
        }
        this.f8529c.mo32494O(sb);
        return sb.toString();
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C2408b generateLayoutParams(AttributeSet attributeSet) {
        return new C2408b(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: i */
    public Object m10368i(int i7, Object obj) {
        if (i7 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap map = this.f8539x;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f8539x.get(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            C2408b c2408b = (C2408b) childAt.getLayoutParams();
            C7370e c7370e = c2408b.f8612v0;
            if ((childAt.getVisibility() != 8 || c2408b.f8584h0 || c2408b.f8586i0 || c2408b.f8590k0 || zIsInEditMode) && !c2408b.f8588j0) {
                int iM32510X = c7370e.m32510X();
                int iM32512Y = c7370e.m32512Y();
                childAt.layout(iM32510X, iM32512Y, c7370e.m32508W() + iM32510X, c7370e.m32570x() + iM32512Y);
            }
        }
        int size = this.f8528b.size();
        if (size > 0) {
            for (int i12 = 0; i12 < size; i12++) {
                ((AbstractC2412c) this.f8528b.get(i12)).m10395k(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        boolean zM10365f = this.f8534s | m10365f(i7, i8);
        this.f8534s = zM10365f;
        if (!zM10365f) {
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                if (getChildAt(i9).isLayoutRequested()) {
                    this.f8534s = true;
                    break;
                }
            }
        }
        this.f8524G = i7;
        this.f8525H = i8;
        this.f8529c.m32601a2(m10371t());
        if (this.f8534s) {
            this.f8534s = false;
            if (m10355C()) {
                this.f8529c.m32603c2();
            }
        }
        this.f8529c.m32586J1(null);
        m10374x(this.f8529c, this.f8535t, i7, i8);
        m10373w(i7, i8, this.f8529c.m32508W(), this.f8529c.m32570x(), this.f8529c.m32595S1(), this.f8529c.m32593Q1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C7370e c7370eM10370r = m10370r(view);
        if ((view instanceof C2416g) && !(c7370eM10370r instanceof C7373h)) {
            C2408b c2408b = (C2408b) view.getLayoutParams();
            C7373h c7373h = new C7373h();
            c2408b.f8612v0 = c7373h;
            c2408b.f8584h0 = true;
            c7373h.m32666B1(c2408b.f8568Z);
        }
        if (view instanceof AbstractC2412c) {
            AbstractC2412c abstractC2412c = (AbstractC2412c) view;
            abstractC2412c.m10399o();
            ((C2408b) view.getLayoutParams()).f8586i0 = true;
            if (!this.f8528b.contains(abstractC2412c)) {
                this.f8528b.add(abstractC2412c);
            }
        }
        this.f8527a.put(view.getId(), view);
        this.f8534s = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f8527a.remove(view.getId());
        this.f8529c.m32705u1(m10370r(view));
        this.f8528b.remove(view);
        this.f8534s = true;
    }

    /* JADX INFO: renamed from: q */
    public View m10369q(int i7) {
        return (View) this.f8527a.get(i7);
    }

    /* JADX INFO: renamed from: r */
    public final C7370e m10370r(View view) {
        if (view == this) {
            return this.f8529c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C2408b) {
            return ((C2408b) view.getLayoutParams()).f8612v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C2408b) {
            return ((C2408b) view.getLayoutParams()).f8612v0;
        }
        return null;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        m10361u();
        super.requestLayout();
    }

    public void setConstraintSet(C2414e c2414e) {
        this.f8536u = c2414e;
    }

    @Override // android.view.View
    public void setId(int i7) {
        this.f8527a.remove(getId());
        super.setId(i7);
        this.f8527a.put(getId(), this);
    }

    public void setMaxHeight(int i7) {
        if (i7 == this.f8533r) {
            return;
        }
        this.f8533r = i7;
        requestLayout();
    }

    public void setMaxWidth(int i7) {
        if (i7 == this.f8532f) {
            return;
        }
        this.f8532f = i7;
        requestLayout();
    }

    public void setMinHeight(int i7) {
        if (i7 == this.f8531e) {
            return;
        }
        this.f8531e = i7;
        requestLayout();
    }

    public void setMinWidth(int i7) {
        if (i7 == this.f8530d) {
            return;
        }
        this.f8530d = i7;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC2415f abstractC2415f) {
        C2413d c2413d = this.f8537v;
        if (c2413d != null) {
            c2413d.m10402c(abstractC2415f);
        }
    }

    public void setOptimizationLevel(int i7) {
        this.f8535t = i7;
        this.f8529c.m32599Y1(i7);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    protected boolean m10371t() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    /* JADX INFO: renamed from: v */
    protected void m10372v(int i7) {
        this.f8537v = new C2413d(getContext(), this, i7);
    }

    /* JADX INFO: renamed from: w */
    protected void m10373w(int i7, int i8, int i9, int i10, boolean z7, boolean z8) {
        C2409c c2409c = this.f8523F;
        int i11 = c2409c.f8623e;
        int iResolveSizeAndState = View.resolveSizeAndState(i9 + c2409c.f8622d, i7, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i10 + i11, i8, 0) & 16777215;
        int iMin = Math.min(this.f8532f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f8533r, iResolveSizeAndState2);
        if (z7) {
            iMin |= 16777216;
        }
        if (z8) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f8540y = iMin;
        this.f8541z = iMin2;
    }

    /* JADX INFO: renamed from: x */
    protected void m10374x(C7371f c7371f, int i7, int i8, int i9) {
        int i10;
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i9);
        int size2 = View.MeasureSpec.getSize(i9);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i11 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.f8523F.m10380c(i8, i9, iMax, iMax2, paddingWidth, i11);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (m10371t()) {
                i10 = iMax4;
            }
            int i12 = size - paddingWidth;
            int i13 = size2 - i11;
            m10363A(c7371f, mode, i12, mode2, i13);
            c7371f.m32596T1(i7, mode, i12, mode2, i13, this.f8540y, this.f8541z, i10, iMax);
        }
        iMax3 = Math.max(0, getPaddingLeft());
        i10 = iMax3;
        int i14 = size - paddingWidth;
        int i15 = size2 - i11;
        m10363A(c7371f, mode, i14, mode2, i15);
        c7371f.m32596T1(i7, mode, i14, mode2, i15, this.f8540y, this.f8541z, i10, iMax);
    }

    /* JADX INFO: renamed from: z */
    public void m10375z(int i7, Object obj, Object obj2) {
        if (i7 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f8539x == null) {
                this.f8539x = new HashMap();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.f8539x.put(strSubstring, num);
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C2408b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8527a = new SparseArray();
        this.f8528b = new ArrayList(4);
        this.f8529c = new C7371f();
        this.f8530d = 0;
        this.f8531e = 0;
        this.f8532f = C3553a.e.API_PRIORITY_OTHER;
        this.f8533r = C3553a.e.API_PRIORITY_OTHER;
        this.f8534s = true;
        this.f8535t = 257;
        this.f8536u = null;
        this.f8537v = null;
        this.f8538w = -1;
        this.f8539x = new HashMap();
        this.f8540y = -1;
        this.f8541z = -1;
        this.f8518A = -1;
        this.f8519B = -1;
        this.f8520C = 0;
        this.f8521D = 0;
        this.f8522E = new SparseArray();
        this.f8523F = new C2409c(this);
        this.f8524G = 0;
        this.f8525H = 0;
        m10360s(attributeSet, i7, 0);
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    public static class C2408b extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: A */
        public int f8543A;

        /* JADX INFO: renamed from: B */
        public int f8544B;

        /* JADX INFO: renamed from: C */
        public int f8545C;

        /* JADX INFO: renamed from: D */
        public int f8546D;

        /* JADX INFO: renamed from: E */
        boolean f8547E;

        /* JADX INFO: renamed from: F */
        boolean f8548F;

        /* JADX INFO: renamed from: G */
        public float f8549G;

        /* JADX INFO: renamed from: H */
        public float f8550H;

        /* JADX INFO: renamed from: I */
        public String f8551I;

        /* JADX INFO: renamed from: J */
        float f8552J;

        /* JADX INFO: renamed from: K */
        int f8553K;

        /* JADX INFO: renamed from: L */
        public float f8554L;

        /* JADX INFO: renamed from: M */
        public float f8555M;

        /* JADX INFO: renamed from: N */
        public int f8556N;

        /* JADX INFO: renamed from: O */
        public int f8557O;

        /* JADX INFO: renamed from: P */
        public int f8558P;

        /* JADX INFO: renamed from: Q */
        public int f8559Q;

        /* JADX INFO: renamed from: R */
        public int f8560R;

        /* JADX INFO: renamed from: S */
        public int f8561S;

        /* JADX INFO: renamed from: T */
        public int f8562T;

        /* JADX INFO: renamed from: U */
        public int f8563U;

        /* JADX INFO: renamed from: V */
        public float f8564V;

        /* JADX INFO: renamed from: W */
        public float f8565W;

        /* JADX INFO: renamed from: X */
        public int f8566X;

        /* JADX INFO: renamed from: Y */
        public int f8567Y;

        /* JADX INFO: renamed from: Z */
        public int f8568Z;

        /* JADX INFO: renamed from: a */
        public int f8569a;

        /* JADX INFO: renamed from: a0 */
        public boolean f8570a0;

        /* JADX INFO: renamed from: b */
        public int f8571b;

        /* JADX INFO: renamed from: b0 */
        public boolean f8572b0;

        /* JADX INFO: renamed from: c */
        public float f8573c;

        /* JADX INFO: renamed from: c0 */
        public String f8574c0;

        /* JADX INFO: renamed from: d */
        public boolean f8575d;

        /* JADX INFO: renamed from: d0 */
        public int f8576d0;

        /* JADX INFO: renamed from: e */
        public int f8577e;

        /* JADX INFO: renamed from: e0 */
        boolean f8578e0;

        /* JADX INFO: renamed from: f */
        public int f8579f;

        /* JADX INFO: renamed from: f0 */
        boolean f8580f0;

        /* JADX INFO: renamed from: g */
        public int f8581g;

        /* JADX INFO: renamed from: g0 */
        boolean f8582g0;

        /* JADX INFO: renamed from: h */
        public int f8583h;

        /* JADX INFO: renamed from: h0 */
        boolean f8584h0;

        /* JADX INFO: renamed from: i */
        public int f8585i;

        /* JADX INFO: renamed from: i0 */
        boolean f8586i0;

        /* JADX INFO: renamed from: j */
        public int f8587j;

        /* JADX INFO: renamed from: j0 */
        boolean f8588j0;

        /* JADX INFO: renamed from: k */
        public int f8589k;

        /* JADX INFO: renamed from: k0 */
        boolean f8590k0;

        /* JADX INFO: renamed from: l */
        public int f8591l;

        /* JADX INFO: renamed from: l0 */
        int f8592l0;

        /* JADX INFO: renamed from: m */
        public int f8593m;

        /* JADX INFO: renamed from: m0 */
        int f8594m0;

        /* JADX INFO: renamed from: n */
        public int f8595n;

        /* JADX INFO: renamed from: n0 */
        int f8596n0;

        /* JADX INFO: renamed from: o */
        public int f8597o;

        /* JADX INFO: renamed from: o0 */
        int f8598o0;

        /* JADX INFO: renamed from: p */
        public int f8599p;

        /* JADX INFO: renamed from: p0 */
        int f8600p0;

        /* JADX INFO: renamed from: q */
        public int f8601q;

        /* JADX INFO: renamed from: q0 */
        int f8602q0;

        /* JADX INFO: renamed from: r */
        public float f8603r;

        /* JADX INFO: renamed from: r0 */
        float f8604r0;

        /* JADX INFO: renamed from: s */
        public int f8605s;

        /* JADX INFO: renamed from: s0 */
        int f8606s0;

        /* JADX INFO: renamed from: t */
        public int f8607t;

        /* JADX INFO: renamed from: t0 */
        int f8608t0;

        /* JADX INFO: renamed from: u */
        public int f8609u;

        /* JADX INFO: renamed from: u0 */
        float f8610u0;

        /* JADX INFO: renamed from: v */
        public int f8611v;

        /* JADX INFO: renamed from: v0 */
        C7370e f8612v0;

        /* JADX INFO: renamed from: w */
        public int f8613w;

        /* JADX INFO: renamed from: w0 */
        public boolean f8614w0;

        /* JADX INFO: renamed from: x */
        public int f8615x;

        /* JADX INFO: renamed from: y */
        public int f8616y;

        /* JADX INFO: renamed from: z */
        public int f8617z;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$b$a */
        private static class a {

            /* JADX INFO: renamed from: a */
            public static final SparseIntArray f8618a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f8618a = sparseIntArray;
                sparseIntArray.append(AbstractC2418i.f9219z2, 64);
                sparseIntArray.append(AbstractC2418i.f9035c2, 65);
                sparseIntArray.append(AbstractC2418i.f9107l2, 8);
                sparseIntArray.append(AbstractC2418i.f9115m2, 9);
                sparseIntArray.append(AbstractC2418i.f9131o2, 10);
                sparseIntArray.append(AbstractC2418i.f9139p2, 11);
                sparseIntArray.append(AbstractC2418i.f9187v2, 12);
                sparseIntArray.append(AbstractC2418i.f9179u2, 13);
                sparseIntArray.append(AbstractC2418i.f8952S1, 14);
                sparseIntArray.append(AbstractC2418i.f8944R1, 15);
                sparseIntArray.append(AbstractC2418i.f8912N1, 16);
                sparseIntArray.append(AbstractC2418i.f8928P1, 52);
                sparseIntArray.append(AbstractC2418i.f8920O1, 53);
                sparseIntArray.append(AbstractC2418i.f8960T1, 2);
                sparseIntArray.append(AbstractC2418i.f8976V1, 3);
                sparseIntArray.append(AbstractC2418i.f8968U1, 4);
                sparseIntArray.append(AbstractC2418i.f8841E2, 49);
                sparseIntArray.append(AbstractC2418i.f8849F2, 50);
                sparseIntArray.append(AbstractC2418i.f9008Z1, 5);
                sparseIntArray.append(AbstractC2418i.f9017a2, 6);
                sparseIntArray.append(AbstractC2418i.f9026b2, 7);
                sparseIntArray.append(AbstractC2418i.f8872I1, 67);
                sparseIntArray.append(AbstractC2418i.f8983W0, 1);
                sparseIntArray.append(AbstractC2418i.f9147q2, 17);
                sparseIntArray.append(AbstractC2418i.f9155r2, 18);
                sparseIntArray.append(AbstractC2418i.f9000Y1, 19);
                sparseIntArray.append(AbstractC2418i.f8992X1, 20);
                sparseIntArray.append(AbstractC2418i.f8881J2, 21);
                sparseIntArray.append(AbstractC2418i.f8905M2, 22);
                sparseIntArray.append(AbstractC2418i.f8889K2, 23);
                sparseIntArray.append(AbstractC2418i.f8865H2, 24);
                sparseIntArray.append(AbstractC2418i.f8897L2, 25);
                sparseIntArray.append(AbstractC2418i.f8873I2, 26);
                sparseIntArray.append(AbstractC2418i.f8857G2, 55);
                sparseIntArray.append(AbstractC2418i.f8913N2, 54);
                sparseIntArray.append(AbstractC2418i.f9075h2, 29);
                sparseIntArray.append(AbstractC2418i.f9195w2, 30);
                sparseIntArray.append(AbstractC2418i.f8984W1, 44);
                sparseIntArray.append(AbstractC2418i.f9091j2, 45);
                sparseIntArray.append(AbstractC2418i.f9211y2, 46);
                sparseIntArray.append(AbstractC2418i.f9083i2, 47);
                sparseIntArray.append(AbstractC2418i.f9203x2, 48);
                sparseIntArray.append(AbstractC2418i.f8896L1, 27);
                sparseIntArray.append(AbstractC2418i.f8888K1, 28);
                sparseIntArray.append(AbstractC2418i.f8809A2, 31);
                sparseIntArray.append(AbstractC2418i.f9043d2, 32);
                sparseIntArray.append(AbstractC2418i.f8825C2, 33);
                sparseIntArray.append(AbstractC2418i.f8817B2, 34);
                sparseIntArray.append(AbstractC2418i.f8833D2, 35);
                sparseIntArray.append(AbstractC2418i.f9059f2, 36);
                sparseIntArray.append(AbstractC2418i.f9051e2, 37);
                sparseIntArray.append(AbstractC2418i.f9067g2, 38);
                sparseIntArray.append(AbstractC2418i.f9099k2, 39);
                sparseIntArray.append(AbstractC2418i.f9171t2, 40);
                sparseIntArray.append(AbstractC2418i.f9123n2, 41);
                sparseIntArray.append(AbstractC2418i.f8936Q1, 42);
                sparseIntArray.append(AbstractC2418i.f8904M1, 43);
                sparseIntArray.append(AbstractC2418i.f9163s2, 51);
                sparseIntArray.append(AbstractC2418i.f8929P2, 66);
            }
        }

        public C2408b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8569a = -1;
            this.f8571b = -1;
            this.f8573c = -1.0f;
            this.f8575d = true;
            this.f8577e = -1;
            this.f8579f = -1;
            this.f8581g = -1;
            this.f8583h = -1;
            this.f8585i = -1;
            this.f8587j = -1;
            this.f8589k = -1;
            this.f8591l = -1;
            this.f8593m = -1;
            this.f8595n = -1;
            this.f8597o = -1;
            this.f8599p = -1;
            this.f8601q = 0;
            this.f8603r = 0.0f;
            this.f8605s = -1;
            this.f8607t = -1;
            this.f8609u = -1;
            this.f8611v = -1;
            this.f8613w = Integer.MIN_VALUE;
            this.f8615x = Integer.MIN_VALUE;
            this.f8616y = Integer.MIN_VALUE;
            this.f8617z = Integer.MIN_VALUE;
            this.f8543A = Integer.MIN_VALUE;
            this.f8544B = Integer.MIN_VALUE;
            this.f8545C = Integer.MIN_VALUE;
            this.f8546D = 0;
            this.f8547E = true;
            this.f8548F = true;
            this.f8549G = 0.5f;
            this.f8550H = 0.5f;
            this.f8551I = null;
            this.f8552J = 0.0f;
            this.f8553K = 1;
            this.f8554L = -1.0f;
            this.f8555M = -1.0f;
            this.f8556N = 0;
            this.f8557O = 0;
            this.f8558P = 0;
            this.f8559Q = 0;
            this.f8560R = 0;
            this.f8561S = 0;
            this.f8562T = 0;
            this.f8563U = 0;
            this.f8564V = 1.0f;
            this.f8565W = 1.0f;
            this.f8566X = -1;
            this.f8567Y = -1;
            this.f8568Z = -1;
            this.f8570a0 = false;
            this.f8572b0 = false;
            this.f8574c0 = null;
            this.f8576d0 = 0;
            this.f8578e0 = true;
            this.f8580f0 = true;
            this.f8582g0 = false;
            this.f8584h0 = false;
            this.f8586i0 = false;
            this.f8588j0 = false;
            this.f8590k0 = false;
            this.f8592l0 = -1;
            this.f8594m0 = -1;
            this.f8596n0 = -1;
            this.f8598o0 = -1;
            this.f8600p0 = Integer.MIN_VALUE;
            this.f8602q0 = Integer.MIN_VALUE;
            this.f8604r0 = 0.5f;
            this.f8612v0 = new C7370e();
            this.f8614w0 = false;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof C2408b) {
                C2408b c2408b = (C2408b) layoutParams;
                this.f8569a = c2408b.f8569a;
                this.f8571b = c2408b.f8571b;
                this.f8573c = c2408b.f8573c;
                this.f8575d = c2408b.f8575d;
                this.f8577e = c2408b.f8577e;
                this.f8579f = c2408b.f8579f;
                this.f8581g = c2408b.f8581g;
                this.f8583h = c2408b.f8583h;
                this.f8585i = c2408b.f8585i;
                this.f8587j = c2408b.f8587j;
                this.f8589k = c2408b.f8589k;
                this.f8591l = c2408b.f8591l;
                this.f8593m = c2408b.f8593m;
                this.f8595n = c2408b.f8595n;
                this.f8597o = c2408b.f8597o;
                this.f8599p = c2408b.f8599p;
                this.f8601q = c2408b.f8601q;
                this.f8603r = c2408b.f8603r;
                this.f8605s = c2408b.f8605s;
                this.f8607t = c2408b.f8607t;
                this.f8609u = c2408b.f8609u;
                this.f8611v = c2408b.f8611v;
                this.f8613w = c2408b.f8613w;
                this.f8615x = c2408b.f8615x;
                this.f8616y = c2408b.f8616y;
                this.f8617z = c2408b.f8617z;
                this.f8543A = c2408b.f8543A;
                this.f8544B = c2408b.f8544B;
                this.f8545C = c2408b.f8545C;
                this.f8546D = c2408b.f8546D;
                this.f8549G = c2408b.f8549G;
                this.f8550H = c2408b.f8550H;
                this.f8551I = c2408b.f8551I;
                this.f8552J = c2408b.f8552J;
                this.f8553K = c2408b.f8553K;
                this.f8554L = c2408b.f8554L;
                this.f8555M = c2408b.f8555M;
                this.f8556N = c2408b.f8556N;
                this.f8557O = c2408b.f8557O;
                this.f8570a0 = c2408b.f8570a0;
                this.f8572b0 = c2408b.f8572b0;
                this.f8558P = c2408b.f8558P;
                this.f8559Q = c2408b.f8559Q;
                this.f8560R = c2408b.f8560R;
                this.f8562T = c2408b.f8562T;
                this.f8561S = c2408b.f8561S;
                this.f8563U = c2408b.f8563U;
                this.f8564V = c2408b.f8564V;
                this.f8565W = c2408b.f8565W;
                this.f8566X = c2408b.f8566X;
                this.f8567Y = c2408b.f8567Y;
                this.f8568Z = c2408b.f8568Z;
                this.f8578e0 = c2408b.f8578e0;
                this.f8580f0 = c2408b.f8580f0;
                this.f8582g0 = c2408b.f8582g0;
                this.f8584h0 = c2408b.f8584h0;
                this.f8592l0 = c2408b.f8592l0;
                this.f8594m0 = c2408b.f8594m0;
                this.f8596n0 = c2408b.f8596n0;
                this.f8598o0 = c2408b.f8598o0;
                this.f8600p0 = c2408b.f8600p0;
                this.f8602q0 = c2408b.f8602q0;
                this.f8604r0 = c2408b.f8604r0;
                this.f8574c0 = c2408b.f8574c0;
                this.f8576d0 = c2408b.f8576d0;
                this.f8612v0 = c2408b.f8612v0;
                this.f8547E = c2408b.f8547E;
                this.f8548F = c2408b.f8548F;
            }
        }

        /* JADX INFO: renamed from: a */
        public void m10376a() {
            this.f8584h0 = false;
            this.f8578e0 = true;
            this.f8580f0 = true;
            int i7 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i7 == -2 && this.f8570a0) {
                this.f8578e0 = false;
                if (this.f8558P == 0) {
                    this.f8558P = 1;
                }
            }
            int i8 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i8 == -2 && this.f8572b0) {
                this.f8580f0 = false;
                if (this.f8559Q == 0) {
                    this.f8559Q = 1;
                }
            }
            if (i7 == 0 || i7 == -1) {
                this.f8578e0 = false;
                if (i7 == 0 && this.f8558P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f8570a0 = true;
                }
            }
            if (i8 == 0 || i8 == -1) {
                this.f8580f0 = false;
                if (i8 == 0 && this.f8559Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f8572b0 = true;
                }
            }
            if (this.f8573c == -1.0f && this.f8569a == -1 && this.f8571b == -1) {
                return;
            }
            this.f8584h0 = true;
            this.f8578e0 = true;
            this.f8580f0 = true;
            if (!(this.f8612v0 instanceof C7373h)) {
                this.f8612v0 = new C7373h();
            }
            ((C7373h) this.f8612v0).m32666B1(this.f8568Z);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004a  */
        /* JADX WARN: Code duplicated, block: B:20:0x0051  */
        /* JADX WARN: Code duplicated, block: B:23:0x0058  */
        /* JADX WARN: Code duplicated, block: B:26:0x005e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0064  */
        /* JADX WARN: Code duplicated, block: B:38:0x007a  */
        /* JADX WARN: Code duplicated, block: B:39:0x0082 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0084  */
        /* JADX WARN: Code duplicated, block: B:41:0x008b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x008d  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        public void resolveLayoutDirection(int i7) {
            int i8;
            int i9;
            int i10;
            int i11;
            int i12 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i13 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i7);
            boolean z7 = false;
            boolean z8 = 1 == getLayoutDirection();
            this.f8596n0 = -1;
            this.f8598o0 = -1;
            this.f8592l0 = -1;
            this.f8594m0 = -1;
            this.f8600p0 = this.f8613w;
            this.f8602q0 = this.f8616y;
            float f7 = this.f8549G;
            this.f8604r0 = f7;
            int i14 = this.f8569a;
            this.f8606s0 = i14;
            int i15 = this.f8571b;
            this.f8608t0 = i15;
            float f8 = this.f8573c;
            this.f8610u0 = f8;
            if (z8) {
                int i16 = this.f8605s;
                if (i16 != -1) {
                    this.f8596n0 = i16;
                } else {
                    int i17 = this.f8607t;
                    if (i17 != -1) {
                        this.f8598o0 = i17;
                    } else {
                        i8 = this.f8609u;
                        if (i8 != -1) {
                            this.f8594m0 = i8;
                            z7 = true;
                        }
                        i9 = this.f8611v;
                        if (i9 != -1) {
                            this.f8592l0 = i9;
                            z7 = true;
                        }
                        i10 = this.f8543A;
                        if (i10 != Integer.MIN_VALUE) {
                            this.f8602q0 = i10;
                        }
                        i11 = this.f8544B;
                        if (i11 != Integer.MIN_VALUE) {
                            this.f8600p0 = i11;
                        }
                        if (z7) {
                            this.f8604r0 = 1.0f - f7;
                        }
                        if (this.f8584h0 && this.f8568Z == 1 && this.f8575d) {
                            if (f8 != -1.0f) {
                                this.f8610u0 = 1.0f - f8;
                                this.f8606s0 = -1;
                                this.f8608t0 = -1;
                            } else if (i14 != -1) {
                                this.f8608t0 = i14;
                                this.f8606s0 = -1;
                                this.f8610u0 = -1.0f;
                            } else if (i15 != -1) {
                                this.f8606s0 = i15;
                                this.f8608t0 = -1;
                                this.f8610u0 = -1.0f;
                            }
                        }
                    }
                }
                z7 = true;
                i8 = this.f8609u;
                if (i8 != -1) {
                    this.f8594m0 = i8;
                    z7 = true;
                }
                i9 = this.f8611v;
                if (i9 != -1) {
                    this.f8592l0 = i9;
                    z7 = true;
                }
                i10 = this.f8543A;
                if (i10 != Integer.MIN_VALUE) {
                    this.f8602q0 = i10;
                }
                i11 = this.f8544B;
                if (i11 != Integer.MIN_VALUE) {
                    this.f8600p0 = i11;
                }
                if (z7) {
                    this.f8604r0 = 1.0f - f7;
                }
                if (this.f8584h0) {
                    if (f8 != -1.0f) {
                        this.f8610u0 = 1.0f - f8;
                        this.f8606s0 = -1;
                        this.f8608t0 = -1;
                    } else if (i14 != -1) {
                        this.f8608t0 = i14;
                        this.f8606s0 = -1;
                        this.f8610u0 = -1.0f;
                    } else if (i15 != -1) {
                        this.f8606s0 = i15;
                        this.f8608t0 = -1;
                        this.f8610u0 = -1.0f;
                    }
                }
            } else {
                int i18 = this.f8605s;
                if (i18 != -1) {
                    this.f8594m0 = i18;
                }
                int i19 = this.f8607t;
                if (i19 != -1) {
                    this.f8592l0 = i19;
                }
                int i20 = this.f8609u;
                if (i20 != -1) {
                    this.f8596n0 = i20;
                }
                int i21 = this.f8611v;
                if (i21 != -1) {
                    this.f8598o0 = i21;
                }
                int i22 = this.f8543A;
                if (i22 != Integer.MIN_VALUE) {
                    this.f8600p0 = i22;
                }
                int i23 = this.f8544B;
                if (i23 != Integer.MIN_VALUE) {
                    this.f8602q0 = i23;
                }
            }
            if (this.f8609u == -1 && this.f8611v == -1 && this.f8607t == -1 && this.f8605s == -1) {
                int i24 = this.f8581g;
                if (i24 != -1) {
                    this.f8596n0 = i24;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i13 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i13;
                    }
                } else {
                    int i25 = this.f8583h;
                    if (i25 != -1) {
                        this.f8598o0 = i25;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i13 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i13;
                        }
                    }
                }
                int i26 = this.f8577e;
                if (i26 != -1) {
                    this.f8592l0 = i26;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i12 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i12;
                    return;
                }
                int i27 = this.f8579f;
                if (i27 != -1) {
                    this.f8594m0 = i27;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i12 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i12;
                }
            }
        }

        public C2408b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8569a = -1;
            this.f8571b = -1;
            this.f8573c = -1.0f;
            this.f8575d = true;
            this.f8577e = -1;
            this.f8579f = -1;
            this.f8581g = -1;
            this.f8583h = -1;
            this.f8585i = -1;
            this.f8587j = -1;
            this.f8589k = -1;
            this.f8591l = -1;
            this.f8593m = -1;
            this.f8595n = -1;
            this.f8597o = -1;
            this.f8599p = -1;
            this.f8601q = 0;
            this.f8603r = 0.0f;
            this.f8605s = -1;
            this.f8607t = -1;
            this.f8609u = -1;
            this.f8611v = -1;
            this.f8613w = Integer.MIN_VALUE;
            this.f8615x = Integer.MIN_VALUE;
            this.f8616y = Integer.MIN_VALUE;
            this.f8617z = Integer.MIN_VALUE;
            this.f8543A = Integer.MIN_VALUE;
            this.f8544B = Integer.MIN_VALUE;
            this.f8545C = Integer.MIN_VALUE;
            this.f8546D = 0;
            this.f8547E = true;
            this.f8548F = true;
            this.f8549G = 0.5f;
            this.f8550H = 0.5f;
            this.f8551I = null;
            this.f8552J = 0.0f;
            this.f8553K = 1;
            this.f8554L = -1.0f;
            this.f8555M = -1.0f;
            this.f8556N = 0;
            this.f8557O = 0;
            this.f8558P = 0;
            this.f8559Q = 0;
            this.f8560R = 0;
            this.f8561S = 0;
            this.f8562T = 0;
            this.f8563U = 0;
            this.f8564V = 1.0f;
            this.f8565W = 1.0f;
            this.f8566X = -1;
            this.f8567Y = -1;
            this.f8568Z = -1;
            this.f8570a0 = false;
            this.f8572b0 = false;
            this.f8574c0 = null;
            this.f8576d0 = 0;
            this.f8578e0 = true;
            this.f8580f0 = true;
            this.f8582g0 = false;
            this.f8584h0 = false;
            this.f8586i0 = false;
            this.f8588j0 = false;
            this.f8590k0 = false;
            this.f8592l0 = -1;
            this.f8594m0 = -1;
            this.f8596n0 = -1;
            this.f8598o0 = -1;
            this.f8600p0 = Integer.MIN_VALUE;
            this.f8602q0 = Integer.MIN_VALUE;
            this.f8604r0 = 0.5f;
            this.f8612v0 = new C7370e();
            this.f8614w0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2418i.f8975V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                int i8 = a.f8618a.get(index);
                switch (i8) {
                    case 1:
                        this.f8568Z = typedArrayObtainStyledAttributes.getInt(index, this.f8568Z);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f8599p);
                        this.f8599p = resourceId;
                        if (resourceId == -1) {
                            this.f8599p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f8601q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8601q);
                        break;
                    case 4:
                        float f7 = typedArrayObtainStyledAttributes.getFloat(index, this.f8603r) % 360.0f;
                        this.f8603r = f7;
                        if (f7 < 0.0f) {
                            this.f8603r = (360.0f - f7) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f8569a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8569a);
                        break;
                    case 6:
                        this.f8571b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8571b);
                        break;
                    case 7:
                        this.f8573c = typedArrayObtainStyledAttributes.getFloat(index, this.f8573c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8577e);
                        this.f8577e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f8577e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8579f);
                        this.f8579f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f8579f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8581g);
                        this.f8581g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f8581g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8583h);
                        this.f8583h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f8583h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8585i);
                        this.f8585i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f8585i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8587j);
                        this.f8587j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f8587j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8589k);
                        this.f8589k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f8589k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8591l);
                        this.f8591l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f8591l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8593m);
                        this.f8593m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f8593m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8605s);
                        this.f8605s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f8605s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8607t);
                        this.f8607t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f8607t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8609u);
                        this.f8609u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f8609u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8611v);
                        this.f8611v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f8611v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case zzbbn.zzt.zzm /* 21 */:
                        this.f8613w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8613w);
                        break;
                    case 22:
                        this.f8615x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8615x);
                        break;
                    case 23:
                        this.f8616y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8616y);
                        break;
                    case 24:
                        this.f8617z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8617z);
                        break;
                    case 25:
                        this.f8543A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8543A);
                        break;
                    case 26:
                        this.f8544B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8544B);
                        break;
                    case 27:
                        this.f8570a0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f8570a0);
                        break;
                    case 28:
                        this.f8572b0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f8572b0);
                        break;
                    case 29:
                        this.f8549G = typedArrayObtainStyledAttributes.getFloat(index, this.f8549G);
                        break;
                    case 30:
                        this.f8550H = typedArrayObtainStyledAttributes.getFloat(index, this.f8550H);
                        break;
                    case 31:
                        int i9 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f8558P = i9;
                        if (i9 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i10 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f8559Q = i10;
                        if (i10 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.f8560R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8560R);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f8560R) == -2) {
                                this.f8560R = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.f8562T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8562T);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f8562T) == -2) {
                                this.f8562T = -2;
                            }
                        }
                        break;
                    case 35:
                        this.f8564V = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f8564V));
                        this.f8558P = 2;
                        break;
                    case 36:
                        try {
                            this.f8561S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8561S);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f8561S) == -2) {
                                this.f8561S = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.f8563U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8563U);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f8563U) == -2) {
                                this.f8563U = -2;
                            }
                        }
                        break;
                    case 38:
                        this.f8565W = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f8565W));
                        this.f8559Q = 2;
                        break;
                    default:
                        switch (i8) {
                            case 44:
                                C2414e.m10412p(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f8554L = typedArrayObtainStyledAttributes.getFloat(index, this.f8554L);
                                break;
                            case 46:
                                this.f8555M = typedArrayObtainStyledAttributes.getFloat(index, this.f8555M);
                                break;
                            case 47:
                                this.f8556N = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f8557O = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f8566X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8566X);
                                break;
                            case 50:
                                this.f8567Y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8567Y);
                                break;
                            case 51:
                                this.f8574c0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8595n);
                                this.f8595n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f8595n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8597o);
                                this.f8597o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f8597o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.f8546D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8546D);
                                break;
                            case 55:
                                this.f8545C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8545C);
                                break;
                            default:
                                switch (i8) {
                                    case 64:
                                        C2414e.m10410n(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.f8547E = true;
                                        break;
                                    case 65:
                                        C2414e.m10410n(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.f8548F = true;
                                        break;
                                    case 66:
                                        this.f8576d0 = typedArrayObtainStyledAttributes.getInt(index, this.f8576d0);
                                        break;
                                    case 67:
                                        this.f8575d = typedArrayObtainStyledAttributes.getBoolean(index, this.f8575d);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            m10376a();
        }

        public C2408b(int i7, int i8) {
            super(i7, i8);
            this.f8569a = -1;
            this.f8571b = -1;
            this.f8573c = -1.0f;
            this.f8575d = true;
            this.f8577e = -1;
            this.f8579f = -1;
            this.f8581g = -1;
            this.f8583h = -1;
            this.f8585i = -1;
            this.f8587j = -1;
            this.f8589k = -1;
            this.f8591l = -1;
            this.f8593m = -1;
            this.f8595n = -1;
            this.f8597o = -1;
            this.f8599p = -1;
            this.f8601q = 0;
            this.f8603r = 0.0f;
            this.f8605s = -1;
            this.f8607t = -1;
            this.f8609u = -1;
            this.f8611v = -1;
            this.f8613w = Integer.MIN_VALUE;
            this.f8615x = Integer.MIN_VALUE;
            this.f8616y = Integer.MIN_VALUE;
            this.f8617z = Integer.MIN_VALUE;
            this.f8543A = Integer.MIN_VALUE;
            this.f8544B = Integer.MIN_VALUE;
            this.f8545C = Integer.MIN_VALUE;
            this.f8546D = 0;
            this.f8547E = true;
            this.f8548F = true;
            this.f8549G = 0.5f;
            this.f8550H = 0.5f;
            this.f8551I = null;
            this.f8552J = 0.0f;
            this.f8553K = 1;
            this.f8554L = -1.0f;
            this.f8555M = -1.0f;
            this.f8556N = 0;
            this.f8557O = 0;
            this.f8558P = 0;
            this.f8559Q = 0;
            this.f8560R = 0;
            this.f8561S = 0;
            this.f8562T = 0;
            this.f8563U = 0;
            this.f8564V = 1.0f;
            this.f8565W = 1.0f;
            this.f8566X = -1;
            this.f8567Y = -1;
            this.f8568Z = -1;
            this.f8570a0 = false;
            this.f8572b0 = false;
            this.f8574c0 = null;
            this.f8576d0 = 0;
            this.f8578e0 = true;
            this.f8580f0 = true;
            this.f8582g0 = false;
            this.f8584h0 = false;
            this.f8586i0 = false;
            this.f8588j0 = false;
            this.f8590k0 = false;
            this.f8592l0 = -1;
            this.f8594m0 = -1;
            this.f8596n0 = -1;
            this.f8598o0 = -1;
            this.f8600p0 = Integer.MIN_VALUE;
            this.f8602q0 = Integer.MIN_VALUE;
            this.f8604r0 = 0.5f;
            this.f8612v0 = new C7370e();
            this.f8614w0 = false;
        }
    }
}
