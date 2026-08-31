package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.internal.AbstractC4543s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p069I3.C0614a;
import p069I3.C0634u;
import p093L3.AbstractC0842a;
import p111O.AbstractC1030Z;
import p111O.C1032a;
import p118P.C1170s;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends AbstractC4438d {

    /* JADX INFO: renamed from: C */
    private static final int f16578C = AbstractC6751l.f26528B;

    /* JADX INFO: renamed from: A */
    private final int f16579A;

    /* JADX INFO: renamed from: B */
    private Set f16580B;

    /* JADX INFO: renamed from: w */
    private final LinkedHashSet f16581w;

    /* JADX INFO: renamed from: x */
    private boolean f16582x;

    /* JADX INFO: renamed from: y */
    private boolean f16583y;

    /* JADX INFO: renamed from: z */
    private boolean f16584z;

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    class C4433a extends C1032a {
        C4433a() {
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: g */
        public void mo4585g(View view, C1170s c1170s) {
            super.mo4585g(view, c1170s);
            c1170s.m5074p0(C1170s.g.m5112a(0, 1, MaterialButtonToggleGroup.this.m19742u(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    public interface InterfaceC4434b {
        /* JADX INFO: renamed from: a */
        void mo19750a(MaterialButtonToggleGroup materialButtonToggleGroup, int i7, boolean z7);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6742c.f26284x);
    }

    private String getChildrenA11yClassName() {
        return (this.f16583y ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            if ((getChildAt(i8) instanceof MaterialButton) && m19738j(i8)) {
                i7++;
            }
        }
        return i7;
    }

    /* JADX INFO: renamed from: j */
    private boolean m19738j(int i7) {
        return getChildAt(i7).getVisibility() != 8;
    }

    /* JADX INFO: renamed from: r */
    private void m19740r(int i7, boolean z7) {
        if (i7 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i7);
            return;
        }
        HashSet hashSet = new HashSet(this.f16580B);
        if (z7 && !hashSet.contains(Integer.valueOf(i7))) {
            if (this.f16583y && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i7));
        } else {
            if (z7 || !hashSet.contains(Integer.valueOf(i7))) {
                return;
            }
            if (!this.f16584z || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i7));
            }
        }
        m19744y(hashSet);
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    /* JADX INFO: renamed from: t */
    private void m19741t(int i7, boolean z7) {
        Iterator it = this.f16581w.iterator();
        while (it.hasNext()) {
            ((InterfaceC4434b) it.next()).mo19750a(this, i7, z7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public int m19742u(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            if (getChildAt(i8) == view) {
                return i7;
            }
            if ((getChildAt(i8) instanceof MaterialButton) && m19738j(i8)) {
                i7++;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: x */
    private void m19743x(int i7, boolean z7) {
        View viewFindViewById = findViewById(i7);
        if (viewFindViewById instanceof MaterialButton) {
            this.f16582x = true;
            ((MaterialButton) viewFindViewById).setChecked(z7);
            this.f16582x = false;
        }
    }

    /* JADX INFO: renamed from: y */
    private void m19744y(Set set) {
        Set set2 = this.f16580B;
        this.f16580B = new HashSet(set);
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            int id = m19763f(i7).getId();
            m19743x(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                m19741t(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: z */
    private void m19745z() {
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            m19763f(i7).setA11yClassName(childrenA11yClassName);
        }
    }

    @Override // com.google.android.material.button.AbstractC4438d, android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i7, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        m19740r(materialButton.getId(), materialButton.isChecked());
        AbstractC1030Z.m4474j0(materialButton, new C4433a());
    }

    public int getCheckedButtonId() {
        if (!this.f16583y || this.f16580B.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f16580B.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            int id = m19763f(i7).getId();
            if (this.f16580B.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i7 = this.f16579A;
        if (i7 != -1) {
            m19744y(Collections.singleton(Integer.valueOf(i7)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1170s.m4998R0(accessibilityNodeInfo).m5072o0(C1170s.f.m5111b(1, getVisibleButtonCount(), false, m19748v() ? 1 : 2));
    }

    /* JADX INFO: renamed from: q */
    public void m19746q(InterfaceC4434b interfaceC4434b) {
        this.f16581w.add(interfaceC4434b);
    }

    /* JADX INFO: renamed from: s */
    public void m19747s() {
        m19744y(new HashSet());
    }

    public void setSelectionRequired(boolean z7) {
        this.f16584z = z7;
    }

    public void setSingleSelection(boolean z7) {
        if (this.f16583y != z7) {
            this.f16583y = z7;
            m19747s();
        }
        m19745z();
    }

    /* JADX INFO: renamed from: v */
    public boolean m19748v() {
        return this.f16583y;
    }

    /* JADX INFO: renamed from: w */
    void m19749w(MaterialButton materialButton, boolean z7) {
        if (this.f16582x) {
            return;
        }
        m19740r(materialButton.getId(), z7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f16578C;
        super(AbstractC0842a.m3884d(context, attributeSet, i7, i8), attributeSet, i7);
        this.f16581w = new LinkedHashSet();
        this.f16582x = false;
        this.f16580B = new HashSet();
        TypedArray typedArrayM20818i = AbstractC4543s.m20818i(getContext(), attributeSet, AbstractC6752m.f26621F3, i7, i8, new int[0]);
        setSingleSelection(typedArrayM20818i.getBoolean(AbstractC6752m.f26665J3, false));
        this.f16579A = typedArrayM20818i.getResourceId(AbstractC6752m.f26643H3, -1);
        this.f16584z = typedArrayM20818i.getBoolean(AbstractC6752m.f26654I3, false);
        if (this.f16595f == null) {
            this.f16595f = C0634u.m2897b(new C0614a(0.0f));
        }
        setEnabled(typedArrayM20818i.getBoolean(AbstractC6752m.f26632G3, true));
        typedArrayM20818i.recycle();
        setImportantForAccessibility(1);
    }

    public void setSingleSelection(int i7) {
        setSingleSelection(getResources().getBoolean(i7));
    }
}
