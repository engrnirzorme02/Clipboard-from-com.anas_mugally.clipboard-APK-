package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.material.internal.t */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4544t {

    /* JADX INFO: renamed from: a */
    private static final Comparator f17378a = new a();

    /* JADX INFO: renamed from: com.google.android.material.internal.t$a */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    /* JADX INFO: renamed from: a */
    private static ImageView m20820a(Toolbar toolbar, Drawable drawable) {
        ImageView imageView;
        Drawable drawable2;
        if (drawable == null) {
            return null;
        }
        for (int i7 = 0; i7 < toolbar.getChildCount(); i7++) {
            View childAt = toolbar.getChildAt(i7);
            if ((childAt instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                return imageView;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static ImageView m20821b(Toolbar toolbar) {
        return m20820a(toolbar, toolbar.getLogo());
    }

    /* JADX INFO: renamed from: c */
    public static TextView m20822c(Toolbar toolbar) {
        List listM20823d = m20823d(toolbar, toolbar.getSubtitle());
        if (listM20823d.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(listM20823d, f17378a);
    }

    /* JADX INFO: renamed from: d */
    private static List m20823d(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < toolbar.getChildCount(); i7++) {
            View childAt = toolbar.getChildAt(i7);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static TextView m20824e(Toolbar toolbar) {
        List listM20823d = m20823d(toolbar, toolbar.getTitle());
        if (listM20823d.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(listM20823d, f17378a);
    }
}
