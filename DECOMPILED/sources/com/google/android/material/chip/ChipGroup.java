package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.AbstractC4530f;
import com.google.android.material.internal.AbstractC4543s;
import com.google.android.material.internal.C4525a;
import java.util.List;
import java.util.Set;
import p093L3.AbstractC0842a;
import p118P.C1170s;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;

/* JADX INFO: loaded from: classes2.dex */
public class ChipGroup extends AbstractC4530f {

    /* JADX INFO: renamed from: v */
    private static final int f16760v = AbstractC6751l.f26557v;

    /* JADX INFO: renamed from: e */
    private int f16761e;

    /* JADX INFO: renamed from: f */
    private int f16762f;

    /* JADX INFO: renamed from: r */
    private InterfaceC4461e f16763r;

    /* JADX INFO: renamed from: s */
    private final C4525a f16764s;

    /* JADX INFO: renamed from: t */
    private final int f16765t;

    /* JADX INFO: renamed from: u */
    private final ViewGroupOnHierarchyChangeListenerC4462f f16766u;

    /* JADX INFO: renamed from: com.google.android.material.chip.ChipGroup$a */
    class C4457a implements C4525a.b {
        C4457a() {
        }

        @Override // com.google.android.material.internal.C4525a.b
        /* JADX INFO: renamed from: a */
        public void mo20065a(Set set) {
            if (ChipGroup.this.f16763r != null) {
                InterfaceC4461e interfaceC4461e = ChipGroup.this.f16763r;
                ChipGroup chipGroup = ChipGroup.this;
                interfaceC4461e.mo20066a(chipGroup, chipGroup.f16764s.m20613j(ChipGroup.this));
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.ChipGroup$b */
    class C4458b implements InterfaceC4461e {
        C4458b(InterfaceC4460d interfaceC4460d) {
        }

        @Override // com.google.android.material.chip.ChipGroup.InterfaceC4461e
        /* JADX INFO: renamed from: a */
        public void mo20066a(ChipGroup chipGroup, List list) {
            if (ChipGroup.this.f16764s.m20615l()) {
                ChipGroup.this.getCheckedChipId();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.ChipGroup$c */
    public static class C4459c extends ViewGroup.MarginLayoutParams {
        public C4459c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C4459c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C4459c(int i7, int i8) {
            super(i7, i8);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.ChipGroup$d */
    public interface InterfaceC4460d {
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.ChipGroup$e */
    public interface InterfaceC4461e {
        /* JADX INFO: renamed from: a */
        void mo20066a(ChipGroup chipGroup, List list);
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.ChipGroup$f */
    private class ViewGroupOnHierarchyChangeListenerC4462f implements ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: a */
        private ViewGroup.OnHierarchyChangeListener f16769a;

        private ViewGroupOnHierarchyChangeListenerC4462f() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(View.generateViewId());
                }
                ChipGroup.this.f16764s.m20609e((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f16769a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.f16764s.m20616n((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f16769a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        /* synthetic */ ViewGroupOnHierarchyChangeListenerC4462f(ChipGroup chipGroup, C4457a c4457a) {
            this();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6742c.f26250e);
    }

    private int getVisibleChipCount() {
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            if ((getChildAt(i8) instanceof Chip) && m20061h(i8)) {
                i7++;
            }
        }
        return i7;
    }

    /* JADX INFO: renamed from: h */
    private boolean m20061h(int i7) {
        return getChildAt(i7).getVisibility() == 0;
    }

    @Override // com.google.android.material.internal.AbstractC4530f
    /* JADX INFO: renamed from: c */
    public boolean mo20062c() {
        return super.mo20062c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C4459c);
    }

    /* JADX INFO: renamed from: g */
    int m20063g(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if ((childAt instanceof Chip) && m20061h(i8)) {
                if (((Chip) childAt) == view) {
                    return i7;
                }
                i7++;
            }
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C4459c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C4459c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f16764s.m20614k();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f16764s.m20613j(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f16761e;
    }

    public int getChipSpacingVertical() {
        return this.f16762f;
    }

    /* JADX INFO: renamed from: i */
    public boolean m20064i() {
        return this.f16764s.m20615l();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i7 = this.f16765t;
        if (i7 != -1) {
            this.f16764s.m20610f(i7);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1170s.m4998R0(accessibilityNodeInfo).m5072o0(C1170s.f.m5111b(getRowCount(), mo20062c() ? getVisibleChipCount() : -1, false, m20064i() ? 1 : 2));
    }

    public void setChipSpacing(int i7) {
        setChipSpacingHorizontal(i7);
        setChipSpacingVertical(i7);
    }

    public void setChipSpacingHorizontal(int i7) {
        if (this.f16761e != i7) {
            this.f16761e = i7;
            setItemSpacing(i7);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i7) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i7));
    }

    public void setChipSpacingResource(int i7) {
        setChipSpacing(getResources().getDimensionPixelOffset(i7));
    }

    public void setChipSpacingVertical(int i7) {
        if (this.f16762f != i7) {
            this.f16762f = i7;
            setLineSpacing(i7);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i7) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i7));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i7) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(InterfaceC4460d interfaceC4460d) {
        if (interfaceC4460d == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new C4458b(interfaceC4460d));
        }
    }

    public void setOnCheckedStateChangeListener(InterfaceC4461e interfaceC4461e) {
        this.f16763r = interfaceC4461e;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f16766u.f16769a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z7) {
        this.f16764s.m20618p(z7);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i7) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i7) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.AbstractC4530f
    public void setSingleLine(boolean z7) {
        super.setSingleLine(z7);
    }

    public void setSingleSelection(boolean z7) {
        this.f16764s.m20619q(z7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f16760v;
        super(AbstractC0842a.m3884d(context, attributeSet, i7, i8), attributeSet, i7);
        C4525a c4525a = new C4525a();
        this.f16764s = c4525a;
        ViewGroupOnHierarchyChangeListenerC4462f viewGroupOnHierarchyChangeListenerC4462f = new ViewGroupOnHierarchyChangeListenerC4462f(this, null);
        this.f16766u = viewGroupOnHierarchyChangeListenerC4462f;
        TypedArray typedArrayM20818i = AbstractC4543s.m20818i(getContext(), attributeSet, AbstractC6752m.f26564A1, i7, i8, new int[0]);
        int dimensionPixelOffset = typedArrayM20818i.getDimensionPixelOffset(AbstractC6752m.f26586C1, 0);
        setChipSpacingHorizontal(typedArrayM20818i.getDimensionPixelOffset(AbstractC6752m.f26597D1, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayM20818i.getDimensionPixelOffset(AbstractC6752m.f26608E1, dimensionPixelOffset));
        setSingleLine(typedArrayM20818i.getBoolean(AbstractC6752m.f26630G1, false));
        setSingleSelection(typedArrayM20818i.getBoolean(AbstractC6752m.f26641H1, false));
        setSelectionRequired(typedArrayM20818i.getBoolean(AbstractC6752m.f26619F1, false));
        this.f16765t = typedArrayM20818i.getResourceId(AbstractC6752m.f26575B1, -1);
        typedArrayM20818i.recycle();
        c4525a.m20617o(new C4457a());
        super.setOnHierarchyChangeListener(viewGroupOnHierarchyChangeListenerC4462f);
        setImportantForAccessibility(1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C4459c(layoutParams);
    }

    public void setSingleLine(int i7) {
        setSingleLine(getResources().getBoolean(i7));
    }

    public void setSingleSelection(int i7) {
        setSingleSelection(getResources().getBoolean(i7));
    }
}
