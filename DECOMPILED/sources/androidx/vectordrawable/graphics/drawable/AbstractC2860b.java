package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2860b {

    /* JADX INFO: renamed from: a */
    Animatable2.AnimationCallback f11591a;

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.b$a */
    class a extends Animatable2.AnimationCallback {
        a() {
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            AbstractC2860b.this.mo14226b(drawable);
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationStart(Drawable drawable) {
            AbstractC2860b.this.mo14227c(drawable);
        }
    }

    /* JADX INFO: renamed from: a */
    Animatable2.AnimationCallback m14225a() {
        if (this.f11591a == null) {
            this.f11591a = new a();
        }
        return this.f11591a;
    }

    /* JADX INFO: renamed from: b */
    public void mo14226b(Drawable drawable) {
    }

    /* JADX INFO: renamed from: c */
    public void mo14227c(Drawable drawable) {
    }
}
