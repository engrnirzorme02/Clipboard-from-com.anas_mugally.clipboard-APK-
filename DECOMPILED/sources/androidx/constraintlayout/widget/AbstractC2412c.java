package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Arrays;
import java.util.HashMap;
import p385x.C7370e;
import p385x.InterfaceC7374i;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2412c extends View {

    /* JADX INFO: renamed from: a */
    protected int[] f8647a;

    /* JADX INFO: renamed from: b */
    protected int f8648b;

    /* JADX INFO: renamed from: c */
    protected Context f8649c;

    /* JADX INFO: renamed from: d */
    protected InterfaceC7374i f8650d;

    /* JADX INFO: renamed from: e */
    protected boolean f8651e;

    /* JADX INFO: renamed from: f */
    protected String f8652f;

    /* JADX INFO: renamed from: r */
    protected String f8653r;

    /* JADX INFO: renamed from: s */
    private View[] f8654s;

    /* JADX INFO: renamed from: t */
    protected HashMap f8655t;

    public AbstractC2412c(Context context) {
        super(context);
        this.f8647a = new int[32];
        this.f8651e = false;
        this.f8654s = null;
        this.f8655t = new HashMap();
        this.f8649c = context;
        mo10351i(null);
    }

    /* JADX INFO: renamed from: a */
    private void m10387a(String str) {
        if (str == null || str.length() == 0 || this.f8649c == null) {
            return;
        }
        String strTrim = str.trim();
        int iM10391h = m10391h(strTrim);
        if (iM10391h != 0) {
            this.f8655t.put(Integer.valueOf(iM10391h), strTrim);
            m10388b(iM10391h);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    /* JADX INFO: renamed from: b */
    private void m10388b(int i7) {
        if (i7 == getId()) {
            return;
        }
        int i8 = this.f8648b + 1;
        int[] iArr = this.f8647a;
        if (i8 > iArr.length) {
            this.f8647a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f8647a;
        int i9 = this.f8648b;
        iArr2[i9] = i7;
        this.f8648b = i9 + 1;
    }

    /* JADX INFO: renamed from: c */
    private void m10389c(String str) {
        if (str == null || str.length() == 0 || this.f8649c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.C2408b) && strTrim.equals(((ConstraintLayout.C2408b) layoutParams).f8574c0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m10388b(childAt.getId());
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private int m10390g(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f8649c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    private int m10391h(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iM10390g = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objM10368i = constraintLayout.m10368i(0, str);
            if (objM10368i instanceof Integer) {
                iM10390g = ((Integer) objM10368i).intValue();
            }
        }
        if (iM10390g == 0 && constraintLayout != null) {
            iM10390g = m10390g(constraintLayout, str);
        }
        if (iM10390g == 0) {
            try {
                iM10390g = AbstractC2417h.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iM10390g == 0 ? this.f8649c.getResources().getIdentifier(str, "id", this.f8649c.getPackageName()) : iM10390g;
    }

    /* JADX INFO: renamed from: d */
    protected void m10392d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m10393e((ConstraintLayout) parent);
    }

    /* JADX INFO: renamed from: e */
    protected void m10393e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i7 = 0; i7 < this.f8648b; i7++) {
            View viewM10369q = constraintLayout.m10369q(this.f8647a[i7]);
            if (viewM10369q != null) {
                viewM10369q.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewM10369q.setTranslationZ(viewM10369q.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    protected void mo10394f(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f8647a, this.f8648b);
    }

    /* JADX INFO: renamed from: i */
    protected void mo10351i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2418i.f8975V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == AbstractC2418i.f9130o1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f8652f = string;
                    setIds(string);
                } else if (index == AbstractC2418i.f9138p1) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f8653r = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo10352j(C7370e c7370e, boolean z7);

    /* JADX INFO: renamed from: k */
    public void m10395k(ConstraintLayout constraintLayout) {
    }

    /* JADX INFO: renamed from: l */
    public void m10396l(ConstraintLayout constraintLayout) {
    }

    /* JADX INFO: renamed from: m */
    public void m10397m(ConstraintLayout constraintLayout) {
    }

    /* JADX INFO: renamed from: n */
    public void m10398n(ConstraintLayout constraintLayout) {
        String str;
        int iM10390g;
        if (isInEditMode()) {
            setIds(this.f8652f);
        }
        InterfaceC7374i interfaceC7374i = this.f8650d;
        if (interfaceC7374i == null) {
            return;
        }
        interfaceC7374i.mo32675a();
        for (int i7 = 0; i7 < this.f8648b; i7++) {
            int i8 = this.f8647a[i7];
            View viewM10369q = constraintLayout.m10369q(i8);
            if (viewM10369q == null && (iM10390g = m10390g(constraintLayout, (str = (String) this.f8655t.get(Integer.valueOf(i8))))) != 0) {
                this.f8647a[i7] = iM10390g;
                this.f8655t.put(Integer.valueOf(iM10390g), str);
                viewM10369q = constraintLayout.m10369q(iM10390g);
            }
            if (viewM10369q != null) {
                this.f8650d.mo32677c(constraintLayout.m10370r(viewM10369q));
            }
        }
        this.f8650d.mo32676b(constraintLayout.f8529c);
    }

    /* JADX INFO: renamed from: o */
    public void m10399o() {
        if (this.f8650d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C2408b) {
            ((ConstraintLayout.C2408b) layoutParams).f8612v0 = (C7370e) this.f8650d;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f8652f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f8653r;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        if (this.f8651e) {
            super.onMeasure(i7, i8);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f8652f = str;
        if (str == null) {
            return;
        }
        int i7 = 0;
        this.f8648b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i7);
            if (iIndexOf == -1) {
                m10387a(str.substring(i7));
                return;
            } else {
                m10387a(str.substring(i7, iIndexOf));
                i7 = iIndexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f8653r = str;
        if (str == null) {
            return;
        }
        int i7 = 0;
        this.f8648b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i7);
            if (iIndexOf == -1) {
                m10389c(str.substring(i7));
                return;
            } else {
                m10389c(str.substring(i7, iIndexOf));
                i7 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f8652f = null;
        this.f8648b = 0;
        for (int i7 : iArr) {
            m10388b(i7);
        }
    }

    @Override // android.view.View
    public void setTag(int i7, Object obj) {
        super.setTag(i7, obj);
        if (obj == null && this.f8652f == null) {
            m10388b(i7);
        }
    }

    public AbstractC2412c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8647a = new int[32];
        this.f8651e = false;
        this.f8654s = null;
        this.f8655t = new HashMap();
        this.f8649c = context;
        mo10351i(attributeSet);
    }
}
