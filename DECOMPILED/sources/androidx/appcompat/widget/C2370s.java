package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import p041F.InterfaceC0401b;

/* JADX INFO: renamed from: androidx.appcompat.widget.s */
/* JADX INFO: loaded from: classes.dex */
class C2370s {

    /* JADX INFO: renamed from: c */
    private static final int[] f8311c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a */
    private final ProgressBar f8312a;

    /* JADX INFO: renamed from: b */
    private Bitmap f8313b;

    /* JADX INFO: renamed from: androidx.appcompat.widget.s$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        public static void m10147a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i7) {
            layerDrawable2.setLayerGravity(i7, layerDrawable.getLayerGravity(i7));
            layerDrawable2.setLayerWidth(i7, layerDrawable.getLayerWidth(i7));
            layerDrawable2.setLayerHeight(i7, layerDrawable.getLayerHeight(i7));
            layerDrawable2.setLayerInsetLeft(i7, layerDrawable.getLayerInsetLeft(i7));
            layerDrawable2.setLayerInsetRight(i7, layerDrawable.getLayerInsetRight(i7));
            layerDrawable2.setLayerInsetTop(i7, layerDrawable.getLayerInsetTop(i7));
            layerDrawable2.setLayerInsetBottom(i7, layerDrawable.getLayerInsetBottom(i7));
            layerDrawable2.setLayerInsetStart(i7, layerDrawable.getLayerInsetStart(i7));
            layerDrawable2.setLayerInsetEnd(i7, layerDrawable.getLayerInsetEnd(i7));
        }
    }

    C2370s(ProgressBar progressBar) {
        this.f8312a = progressBar;
    }

    /* JADX INFO: renamed from: a */
    private Shape m10142a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* JADX INFO: renamed from: e */
    private Drawable m10143e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i7 = 0; i7 < numberOfFrames; i7++) {
            Drawable drawableM10146d = m10146d(animationDrawable.getFrame(i7), true);
            drawableM10146d.setLevel(10000);
            animationDrawable2.addFrame(drawableM10146d, animationDrawable.getDuration(i7));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* JADX INFO: renamed from: b */
    Bitmap m10144b() {
        return this.f8313b;
    }

    /* JADX INFO: renamed from: c */
    void mo10145c(AttributeSet attributeSet, int i7) {
        C2348d0 c2348d0M10025v = C2348d0.m10025v(this.f8312a.getContext(), attributeSet, f8311c, i7, 0);
        Drawable drawableM10033h = c2348d0M10025v.m10033h(0);
        if (drawableM10033h != null) {
            this.f8312a.setIndeterminateDrawable(m10143e(drawableM10033h));
        }
        Drawable drawableM10033h2 = c2348d0M10025v.m10033h(1);
        if (drawableM10033h2 != null) {
            this.f8312a.setProgressDrawable(m10146d(drawableM10033h2, false));
        }
        c2348d0M10025v.m10046x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    Drawable m10146d(Drawable drawable, boolean z7) {
        if (drawable instanceof InterfaceC0401b) {
            InterfaceC0401b interfaceC0401b = (InterfaceC0401b) drawable;
            Drawable drawableM1725b = interfaceC0401b.m1725b();
            if (drawableM1725b != null) {
                interfaceC0401b.m1724a(m10146d(drawableM1725b, z7));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i7 = 0; i7 < numberOfLayers; i7++) {
                    int id = layerDrawable.getId(i7);
                    drawableArr[i7] = m10146d(layerDrawable.getDrawable(i7), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i8 = 0; i8 < numberOfLayers; i8++) {
                    layerDrawable2.setId(i8, layerDrawable.getId(i8));
                    a.m10147a(layerDrawable, layerDrawable2, i8);
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f8313b == null) {
                    this.f8313b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(m10142a());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z7 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
