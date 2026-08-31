package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView {

    /* JADX INFO: renamed from: a */
    private final C2349e f7879a;

    /* JADX INFO: renamed from: b */
    private final C2367p f7880b;

    /* JADX INFO: renamed from: c */
    private boolean f7881c;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C2349e c2349e = this.f7879a;
        if (c2349e != null) {
            c2349e.m10049b();
        }
        C2367p c2367p = this.f7880b;
        if (c2367p != null) {
            c2367p.m10130c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2349e c2349e = this.f7879a;
        if (c2349e != null) {
            return c2349e.m10050c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2349e c2349e = this.f7879a;
        if (c2349e != null) {
            return c2349e.m10051d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C2367p c2367p = this.f7880b;
        if (c2367p != null) {
            return c2367p.m10131d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C2367p c2367p = this.f7880b;
        if (c2367p != null) {
            return c2367p.m10132e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f7880b.m10133f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2349e c2349e = this.f7879a;
        if (c2349e != null) {
            c2349e.m10053f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C2349e c2349e = this.f7879a;
        if (c2349e != null) {
            c2349e.m10054g(i7);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C2367p c2367p = this.f7880b;
        if (c2367p != null) {
            c2367p.m10130c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C2367p c2367p = this.f7880b;
        if (c2367p != null && drawable != null && !this.f7881c) {
            c2367p.m10135h(drawable);
        }
        super.setImageDrawable(drawable);
        C2367p c2367p2 = this.f7880b;
        if (c2367p2 != null) {
            c2367p2.m10130c();
            if (this.f7881c) {
                return;
            }
            this.f7880b.m10129b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i7) {
        super.setImageLevel(i7);
        this.f7881c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i7) {
        C2367p c2367p = this.f7880b;
        if (c2367p != null) {
            c2367p.m10136i(i7);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C2367p c2367p = this.f7880b;
        if (c2367p != null) {
            c2367p.m10130c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2349e c2349e = this.f7879a;
        if (c2349e != null) {
            c2349e.m10056i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2349e c2349e = this.f7879a;
        if (c2349e != null) {
            c2349e.m10057j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C2367p c2367p = this.f7880b;
        if (c2367p != null) {
            c2367p.m10137j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C2367p c2367p = this.f7880b;
        if (c2367p != null) {
            c2367p.m10138k(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i7) {
        super(C2342a0.m9997b(context), attributeSet, i7);
        this.f7881c = false;
        AbstractC2340Z.m9984a(this, getContext());
        C2349e c2349e = new C2349e(this);
        this.f7879a = c2349e;
        c2349e.m10052e(attributeSet, i7);
        C2367p c2367p = new C2367p(this);
        this.f7880b = c2367p;
        c2367p.m10134g(attributeSet, i7);
    }
}
