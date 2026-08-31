package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import p104N.AbstractC0910g;
import p333q3.AbstractC6826a;
import p333q3.AbstractC6827b;
import p333q3.C6831f;

/* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.b */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4517b implements InterfaceC4521f {

    /* JADX INFO: renamed from: a */
    private final Context f17102a;

    /* JADX INFO: renamed from: b */
    private final ExtendedFloatingActionButton f17103b;

    /* JADX INFO: renamed from: c */
    private final ArrayList f17104c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private final C4516a f17105d;

    /* JADX INFO: renamed from: e */
    private C6831f f17106e;

    /* JADX INFO: renamed from: f */
    private C6831f f17107f;

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.b$a */
    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(AbstractC6826a.m29843a(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.f17058m0.getColorForState(extendedFloatingActionButton.getDrawableState(), AbstractC4517b.this.f17103b.f17058m0.getDefaultColor()))));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f7) {
            int colorForState = extendedFloatingActionButton.f17058m0.getColorForState(extendedFloatingActionButton.getDrawableState(), AbstractC4517b.this.f17103b.f17058m0.getDefaultColor());
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (AbstractC6826a.m29843a(0.0f, Color.alpha(colorForState) / 255.0f, f7.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f7.floatValue() == 1.0f) {
                extendedFloatingActionButton.m20470Q(extendedFloatingActionButton.f17058m0);
            } else {
                extendedFloatingActionButton.m20470Q(colorStateListValueOf);
            }
        }
    }

    AbstractC4517b(ExtendedFloatingActionButton extendedFloatingActionButton, C4516a c4516a) {
        this.f17103b = extendedFloatingActionButton;
        this.f17102a = extendedFloatingActionButton.getContext();
        this.f17105d = c4516a;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC4521f
    /* JADX INFO: renamed from: a */
    public void mo20496a() {
        this.f17105d.m20516b();
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC4521f
    /* JADX INFO: renamed from: d */
    public C6831f mo20519d() {
        return this.f17107f;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC4521f
    /* JADX INFO: renamed from: e */
    public final void mo20520e(C6831f c6831f) {
        this.f17107f = c6831f;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC4521f
    /* JADX INFO: renamed from: g */
    public void mo20493g() {
        this.f17105d.m20516b();
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC4521f
    /* JADX INFO: renamed from: h */
    public AnimatorSet mo20494h() {
        return m20522l(m20523m());
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC4521f
    /* JADX INFO: renamed from: i */
    public final List mo20521i() {
        return this.f17104c;
    }

    /* JADX INFO: renamed from: l */
    AnimatorSet m20522l(C6831f c6831f) {
        ArrayList arrayList = new ArrayList();
        if (c6831f.m29859i("opacity")) {
            arrayList.add(c6831f.m29856f("opacity", this.f17103b, View.ALPHA));
        }
        if (c6831f.m29859i("scale")) {
            arrayList.add(c6831f.m29856f("scale", this.f17103b, View.SCALE_Y));
            arrayList.add(c6831f.m29856f("scale", this.f17103b, View.SCALE_X));
        }
        if (c6831f.m29859i("width")) {
            arrayList.add(c6831f.m29856f("width", this.f17103b, ExtendedFloatingActionButton.f17040r0));
        }
        if (c6831f.m29859i("height")) {
            arrayList.add(c6831f.m29856f("height", this.f17103b, ExtendedFloatingActionButton.f17041s0));
        }
        if (c6831f.m29859i("paddingStart")) {
            arrayList.add(c6831f.m29856f("paddingStart", this.f17103b, ExtendedFloatingActionButton.f17042t0));
        }
        if (c6831f.m29859i("paddingEnd")) {
            arrayList.add(c6831f.m29856f("paddingEnd", this.f17103b, ExtendedFloatingActionButton.f17043u0));
        }
        if (c6831f.m29859i("labelOpacity")) {
            arrayList.add(c6831f.m29856f("labelOpacity", this.f17103b, new a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AbstractC6827b.m29846a(animatorSet, arrayList);
        return animatorSet;
    }

    /* JADX INFO: renamed from: m */
    public final C6831f m20523m() {
        C6831f c6831f = this.f17107f;
        if (c6831f != null) {
            return c6831f;
        }
        if (this.f17106e == null) {
            this.f17106e = C6831f.m29854d(this.f17102a, mo20490b());
        }
        return (C6831f) AbstractC0910g.m4139g(this.f17106e);
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC4521f
    public void onAnimationStart(Animator animator) {
        this.f17105d.m20517c(animator);
    }
}
