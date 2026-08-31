package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p345s.AbstractC6938a;
import p345s.AbstractC6939b;
import p345s.AbstractC6940c;
import p345s.AbstractC6941d;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: s */
    private static final int[] f8424s = {R.attr.colorBackground};

    /* JADX INFO: renamed from: t */
    private static final InterfaceC2387c f8425t;

    /* JADX INFO: renamed from: a */
    private boolean f8426a;

    /* JADX INFO: renamed from: b */
    private boolean f8427b;

    /* JADX INFO: renamed from: c */
    int f8428c;

    /* JADX INFO: renamed from: d */
    int f8429d;

    /* JADX INFO: renamed from: e */
    final Rect f8430e;

    /* JADX INFO: renamed from: f */
    final Rect f8431f;

    /* JADX INFO: renamed from: r */
    private final InterfaceC2386b f8432r;

    /* JADX INFO: renamed from: androidx.cardview.widget.CardView$a */
    class C2384a implements InterfaceC2386b {

        /* JADX INFO: renamed from: a */
        private Drawable f8433a;

        C2384a() {
        }

        @Override // androidx.cardview.widget.InterfaceC2386b
        /* JADX INFO: renamed from: a */
        public void mo10221a(int i7, int i8, int i9, int i10) {
            CardView.this.f8431f.set(i7, i8, i9, i10);
            CardView cardView = CardView.this;
            Rect rect = cardView.f8430e;
            CardView.super.setPadding(i7 + rect.left, i8 + rect.top, i9 + rect.right, i10 + rect.bottom);
        }

        @Override // androidx.cardview.widget.InterfaceC2386b
        /* JADX INFO: renamed from: b */
        public void mo10222b(Drawable drawable) {
            this.f8433a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.InterfaceC2386b
        /* JADX INFO: renamed from: c */
        public boolean mo10223c() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.InterfaceC2386b
        /* JADX INFO: renamed from: d */
        public boolean mo10224d() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.InterfaceC2386b
        /* JADX INFO: renamed from: e */
        public Drawable mo10225e() {
            return this.f8433a;
        }

        @Override // androidx.cardview.widget.InterfaceC2386b
        /* JADX INFO: renamed from: f */
        public View mo10226f() {
            return CardView.this;
        }
    }

    static {
        C2385a c2385a = new C2385a();
        f8425t = c2385a;
        c2385a.mo10237j();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6938a.f27877a);
    }

    /* JADX INFO: renamed from: b */
    public void m10220b(int i7, int i8, int i9, int i10) {
        this.f8430e.set(i7, i8, i9, i10);
        f8425t.mo10236i(this.f8432r);
    }

    public ColorStateList getCardBackgroundColor() {
        return f8425t.mo10235h(this.f8432r);
    }

    public float getCardElevation() {
        return f8425t.mo10230c(this.f8432r);
    }

    public int getContentPaddingBottom() {
        return this.f8430e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f8430e.left;
    }

    public int getContentPaddingRight() {
        return this.f8430e.right;
    }

    public int getContentPaddingTop() {
        return this.f8430e.top;
    }

    public float getMaxCardElevation() {
        return f8425t.mo10234g(this.f8432r);
    }

    public boolean getPreventCornerOverlap() {
        return this.f8427b;
    }

    public float getRadius() {
        return f8425t.mo10231d(this.f8432r);
    }

    public boolean getUseCompatPadding() {
        return this.f8426a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        InterfaceC2387c interfaceC2387c = f8425t;
        if (interfaceC2387c instanceof C2385a) {
            super.onMeasure(i7, i8);
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i7 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(interfaceC2387c.mo10239l(this.f8432r)), View.MeasureSpec.getSize(i7)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i8);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i8 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(interfaceC2387c.mo10238k(this.f8432r)), View.MeasureSpec.getSize(i8)), mode2);
        }
        super.onMeasure(i7, i8);
    }

    public void setCardBackgroundColor(int i7) {
        f8425t.mo10241n(this.f8432r, ColorStateList.valueOf(i7));
    }

    public void setCardElevation(float f7) {
        f8425t.mo10233f(this.f8432r, f7);
    }

    public void setMaxCardElevation(float f7) {
        f8425t.mo10242o(this.f8432r, f7);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i7) {
        this.f8429d = i7;
        super.setMinimumHeight(i7);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i7) {
        this.f8428c = i7;
        super.setMinimumWidth(i7);
    }

    @Override // android.view.View
    public void setPadding(int i7, int i8, int i9, int i10) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i7, int i8, int i9, int i10) {
    }

    public void setPreventCornerOverlap(boolean z7) {
        if (z7 != this.f8427b) {
            this.f8427b = z7;
            f8425t.mo10240m(this.f8432r);
        }
    }

    public void setRadius(float f7) {
        f8425t.mo10229b(this.f8432r, f7);
    }

    public void setUseCompatPadding(boolean z7) {
        if (this.f8426a != z7) {
            this.f8426a = z7;
            f8425t.mo10232e(this.f8432r);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i7) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i7);
        Rect rect = new Rect();
        this.f8430e = rect;
        this.f8431f = new Rect();
        C2384a c2384a = new C2384a();
        this.f8432r = c2384a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6941d.f27881a, i7, AbstractC6940c.f27880a);
        int i8 = AbstractC6941d.f27884d;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(i8);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f8424s);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(AbstractC6939b.f27879b) : getResources().getColor(AbstractC6939b.f27878a));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(AbstractC6941d.f27885e, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(AbstractC6941d.f27886f, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(AbstractC6941d.f27887g, 0.0f);
        this.f8426a = typedArrayObtainStyledAttributes.getBoolean(AbstractC6941d.f27889i, false);
        this.f8427b = typedArrayObtainStyledAttributes.getBoolean(AbstractC6941d.f27888h, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC6941d.f27890j, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC6941d.f27892l, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC6941d.f27894n, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC6941d.f27893m, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC6941d.f27891k, dimensionPixelSize);
        float f7 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f8428c = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC6941d.f27882b, 0);
        this.f8429d = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC6941d.f27883c, 0);
        typedArrayObtainStyledAttributes.recycle();
        f8425t.mo10228a(c2384a, context, colorStateList, dimension, dimension2, f7);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f8425t.mo10241n(this.f8432r, colorStateList);
    }
}
