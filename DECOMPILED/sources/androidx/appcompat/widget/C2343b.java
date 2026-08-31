package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: androidx.appcompat.widget.b */
/* JADX INFO: loaded from: classes.dex */
class C2343b extends Drawable {

    /* JADX INFO: renamed from: a */
    final ActionBarContainer f8178a;

    /* JADX INFO: renamed from: androidx.appcompat.widget.b$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        public static void m9998a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C2343b(ActionBarContainer actionBarContainer) {
        this.f8178a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f8178a;
        if (actionBarContainer.f7801s) {
            Drawable drawable = actionBarContainer.f7800r;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f7798e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f8178a;
        Drawable drawable3 = actionBarContainer2.f7799f;
        if (drawable3 == null || !actionBarContainer2.f7802t) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f8178a;
        if (actionBarContainer.f7801s) {
            if (actionBarContainer.f7800r != null) {
                a.m9998a(actionBarContainer.f7798e, outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f7798e;
            if (drawable != null) {
                a.m9998a(drawable, outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
