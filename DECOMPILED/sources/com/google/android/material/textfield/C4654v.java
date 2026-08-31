package com.google.android.material.textfield;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C2320S;
import androidx.appcompat.widget.C2347d;
import com.google.android.material.internal.AbstractC4532h;
import com.google.android.material.internal.AbstractC4543s;
import java.util.List;
import p045F3.AbstractC0423c;
import p069I3.C0622i;
import p093L3.AbstractC0842a;
import p255h.AbstractC5520a;
import p255h.AbstractC5528i;
import p325p3.AbstractC6744e;
import p325p3.AbstractC6748i;
import p325p3.AbstractC6752m;
import p397y3.AbstractC7539a;

/* JADX INFO: renamed from: com.google.android.material.textfield.v */
/* JADX INFO: loaded from: classes2.dex */
public class C4654v extends C2347d {

    /* JADX INFO: renamed from: e */
    private final C2320S f18111e;

    /* JADX INFO: renamed from: f */
    private final AccessibilityManager f18112f;

    /* JADX INFO: renamed from: r */
    private final Rect f18113r;

    /* JADX INFO: renamed from: s */
    private final int f18114s;

    /* JADX INFO: renamed from: t */
    private final float f18115t;

    /* JADX INFO: renamed from: u */
    private ColorStateList f18116u;

    /* JADX INFO: renamed from: v */
    private int f18117v;

    /* JADX INFO: renamed from: w */
    private ColorStateList f18118w;

    /* JADX INFO: renamed from: com.google.android.material.textfield.v$a */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
            C4654v c4654v = C4654v.this;
            Object objM9855v = i7 < 0 ? c4654v.f18111e.m9855v() : c4654v.getAdapter().getItem(i7);
            C4654v c4654v2 = C4654v.this;
            c4654v2.setText(c4654v2.convertSelectionToString(objM9855v), false);
            AdapterView.OnItemClickListener onItemClickListener = C4654v.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i7 < 0) {
                    view = C4654v.this.f18111e.m9858y();
                    i7 = C4654v.this.f18111e.m9857x();
                    j7 = C4654v.this.f18111e.m9856w();
                }
                onItemClickListener.onItemClick(C4654v.this.f18111e.mo9457k(), view, i7, j7);
            }
            C4654v.this.f18111e.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.v$b */
    private class b extends ArrayAdapter {

        /* JADX INFO: renamed from: a */
        private ColorStateList f18120a;

        /* JADX INFO: renamed from: b */
        private ColorStateList f18121b;

        b(Context context, int i7, String[] strArr) {
            super(context, i7, strArr);
            m21709f();
        }

        /* JADX INFO: renamed from: a */
        private ColorStateList m21704a() {
            if (!m21706c() || !m21707d()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            int colorForState = C4654v.this.f18118w.getColorForState(iArr2, 0);
            int colorForState2 = C4654v.this.f18118w.getColorForState(iArr, 0);
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{AbstractC7539a.m33178i(C4654v.this.f18117v, colorForState), AbstractC7539a.m33178i(C4654v.this.f18117v, colorForState2), C4654v.this.f18117v});
        }

        /* JADX INFO: renamed from: b */
        private Drawable m21705b() {
            if (!m21706c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(C4654v.this.f18117v);
            if (this.f18121b == null) {
                return colorDrawable;
            }
            colorDrawable.setTintList(this.f18120a);
            return new RippleDrawable(this.f18121b, colorDrawable, null);
        }

        /* JADX INFO: renamed from: c */
        private boolean m21706c() {
            return C4654v.this.f18117v != 0;
        }

        /* JADX INFO: renamed from: d */
        private boolean m21707d() {
            return C4654v.this.f18118w != null;
        }

        /* JADX INFO: renamed from: e */
        private ColorStateList m21708e() {
            if (!m21707d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{C4654v.this.f18118w.getColorForState(iArr, 0), 0});
        }

        /* JADX INFO: renamed from: f */
        void m21709f() {
            this.f18121b = m21708e();
            this.f18120a = m21704a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i7, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i7, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                textView.setBackground(C4654v.this.getText().toString().contentEquals(textView.getText()) ? m21705b() : null);
            }
            return view2;
        }
    }

    public C4654v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5520a.f20975m);
    }

    /* JADX INFO: renamed from: f */
    private TextInputLayout m21698f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    private boolean m21699g() {
        return m21701i() || m21700h();
    }

    /* JADX INFO: renamed from: h */
    private boolean m21700h() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f18112f;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f18112f.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    private boolean m21701i() {
        AccessibilityManager accessibilityManager = this.f18112f;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    /* JADX INFO: renamed from: j */
    private int m21702j() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutM21698f = m21698f();
        int i7 = 0;
        if (adapter == null || textInputLayoutM21698f == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f18111e.m9857x()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutM21698f);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableM9845c = this.f18111e.m9845c();
        if (drawableM9845c != null) {
            drawableM9845c.getPadding(this.f18113r);
            Rect rect = this.f18113r;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutM21698f.getEndIconView().getMeasuredWidth();
    }

    /* JADX INFO: renamed from: k */
    private void m21703k() {
        TextInputLayout textInputLayoutM21698f = m21698f();
        if (textInputLayoutM21698f != null) {
            textInputLayoutM21698f.m21497t0();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (m21699g()) {
            this.f18111e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f18116u;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutM21698f = m21698f();
        return (textInputLayoutM21698f == null || !textInputLayoutM21698f.m21488U()) ? super.getHint() : textInputLayoutM21698f.getHint();
    }

    public float getPopupElevation() {
        return this.f18115t;
    }

    public int getSimpleItemSelectedColor() {
        return this.f18117v;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f18118w;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutM21698f = m21698f();
        if (textInputLayoutM21698f != null && textInputLayoutM21698f.m21488U() && super.getHint() == null && AbstractC4532h.m20709d()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f18111e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m21702j()), View.MeasureSpec.getSize(i7)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z7) {
        if (m21699g()) {
            return;
        }
        super.onWindowFocusChanged(z7);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t7) {
        super.setAdapter(t7);
        this.f18111e.mo9851p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C2320S c2320s = this.f18111e;
        if (c2320s != null) {
            c2320s.m9846d(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i7) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i7));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f18116u = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C0622i) {
            ((C0622i) dropDownBackground).m2718g0(this.f18116u);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f18111e.m9840M(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i7) {
        super.setRawInputType(i7);
        m21703k();
    }

    public void setSimpleItemSelectedColor(int i7) {
        this.f18117v = i7;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).m21709f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f18118w = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).m21709f();
        }
    }

    public void setSimpleItems(int i7) {
        setSimpleItems(getResources().getStringArray(i7));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (m21699g()) {
            this.f18111e.mo9454b();
        } else {
            super.showDropDown();
        }
    }

    public C4654v(Context context, AttributeSet attributeSet, int i7) {
        super(AbstractC0842a.m3884d(context, attributeSet, i7, 0), attributeSet, i7);
        this.f18113r = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM20818i = AbstractC4543s.m20818i(context2, attributeSet, AbstractC6752m.f26763S2, i7, AbstractC5528i.f21113e, new int[0]);
        int i8 = AbstractC6752m.f26774T2;
        if (typedArrayM20818i.hasValue(i8) && typedArrayM20818i.getInt(i8, 0) == 0) {
            setKeyListener(null);
        }
        this.f18114s = typedArrayM20818i.getResourceId(AbstractC6752m.f26807W2, AbstractC6748i.f26471t);
        this.f18115t = typedArrayM20818i.getDimensionPixelOffset(AbstractC6752m.f26785U2, AbstractC6744e.f26355l0);
        int i9 = AbstractC6752m.f26796V2;
        if (typedArrayM20818i.hasValue(i9)) {
            this.f18116u = ColorStateList.valueOf(typedArrayM20818i.getColor(i9, 0));
        }
        this.f18117v = typedArrayM20818i.getColor(AbstractC6752m.f26817X2, 0);
        this.f18118w = AbstractC0423c.m1825a(context2, typedArrayM20818i, AbstractC6752m.f26827Y2);
        this.f18112f = (AccessibilityManager) context2.getSystemService("accessibility");
        C2320S c2320s = new C2320S(context2);
        this.f18111e = c2320s;
        c2320s.m9837J(true);
        c2320s.m9831D(this);
        c2320s.m9836I(2);
        c2320s.mo9851p(getAdapter());
        c2320s.m9839L(new a());
        int i10 = AbstractC6752m.f26837Z2;
        if (typedArrayM20818i.hasValue(i10)) {
            setSimpleItems(typedArrayM20818i.getResourceId(i10, 0));
        }
        typedArrayM20818i.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.f18114s, strArr));
    }
}
