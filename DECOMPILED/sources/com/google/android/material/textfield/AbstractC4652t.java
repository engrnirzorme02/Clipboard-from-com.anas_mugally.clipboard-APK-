package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;
import p041F.AbstractC0400a;

/* JADX INFO: renamed from: com.google.android.material.textfield.t */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4652t {
    /* JADX INFO: renamed from: a */
    static void m21639a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = AbstractC0400a.m1712r(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(m21641c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: b */
    static ImageView.ScaleType m21640b(int i7) {
        if (i7 == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i7 == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i7 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i7 == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i7 != 5) {
            return i7 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    /* JADX INFO: renamed from: c */
    private static int[] m21641c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        return iArrCopyOf;
    }

    /* JADX INFO: renamed from: d */
    static void m21642d(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(m21641c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable drawableMutate = AbstractC0400a.m1712r(drawable).mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    /* JADX INFO: renamed from: e */
    static void m21643e(CheckableImageButton checkableImageButton) {
    }

    /* JADX INFO: renamed from: f */
    private static void m21644f(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z7 = onLongClickListener != null;
        boolean z8 = zHasOnClickListeners || z7;
        checkableImageButton.setFocusable(z8);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z7);
        checkableImageButton.setImportantForAccessibility(z8 ? 1 : 2);
    }

    /* JADX INFO: renamed from: g */
    static void m21645g(CheckableImageButton checkableImageButton, int i7) {
        checkableImageButton.setMinimumWidth(i7);
        checkableImageButton.setMinimumHeight(i7);
    }

    /* JADX INFO: renamed from: h */
    static void m21646h(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m21644f(checkableImageButton, onLongClickListener);
    }

    /* JADX INFO: renamed from: i */
    static void m21647i(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m21644f(checkableImageButton, onLongClickListener);
    }

    /* JADX INFO: renamed from: j */
    static void m21648j(CheckableImageButton checkableImageButton, ImageView.ScaleType scaleType) {
        checkableImageButton.setScaleType(scaleType);
    }
}
