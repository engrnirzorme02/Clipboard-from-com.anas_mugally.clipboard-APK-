package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import p058H0.AbstractC0493a;
import p111O.AbstractC1030Z;

/* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.a */
/* JADX INFO: loaded from: classes.dex */
class C2819a extends ImageView {

    /* JADX INFO: renamed from: a */
    private Animation.AnimationListener f11375a;

    /* JADX INFO: renamed from: b */
    private int f11376b;

    /* JADX INFO: renamed from: c */
    private int f11377c;

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.a$a */
    private static class a extends OvalShape {

        /* JADX INFO: renamed from: a */
        private Paint f11378a = new Paint();

        /* JADX INFO: renamed from: b */
        private int f11379b;

        /* JADX INFO: renamed from: c */
        private C2819a f11380c;

        a(C2819a c2819a, int i7) {
            this.f11380c = c2819a;
            this.f11379b = i7;
            m14019a((int) rect().width());
        }

        /* JADX INFO: renamed from: a */
        private void m14019a(int i7) {
            float f7 = i7 / 2;
            this.f11378a.setShader(new RadialGradient(f7, f7, this.f11379b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width = this.f11380c.getWidth() / 2;
            float f7 = width;
            float height = this.f11380c.getHeight() / 2;
            canvas.drawCircle(f7, height, f7, this.f11378a);
            canvas.drawCircle(f7, height, width - this.f11379b, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f7, float f8) {
            super.onResize(f7, f8);
            m14019a((int) f7);
        }
    }

    C2819a(Context context) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f7 = getContext().getResources().getDisplayMetrics().density;
        int i7 = (int) (1.75f * f7);
        int i8 = (int) (0.0f * f7);
        this.f11376b = (int) (3.5f * f7);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(AbstractC0493a.f1848f);
        this.f11377c = typedArrayObtainStyledAttributes.getColor(AbstractC0493a.f1849g, -328966);
        typedArrayObtainStyledAttributes.recycle();
        if (m14017a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            AbstractC1030Z.m4486p0(this, f7 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new a(this, this.f11376b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f11376b, i8, i7, 503316480);
            int i9 = this.f11376b;
            setPadding(i9, i9, i9, i9);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f11377c);
        AbstractC1030Z.m4480m0(this, shapeDrawable);
    }

    /* JADX INFO: renamed from: a */
    private boolean m14017a() {
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m14018b(Animation.AnimationListener animationListener) {
        this.f11375a = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f11375a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f11375a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (m14017a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f11376b * 2), getMeasuredHeight() + (this.f11376b * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i7);
            this.f11377c = i7;
        }
    }
}
