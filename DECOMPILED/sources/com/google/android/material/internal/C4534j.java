package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C2280e;
import androidx.appcompat.view.menu.C2282g;

/* JADX INFO: renamed from: com.google.android.material.internal.j */
/* JADX INFO: loaded from: classes2.dex */
public class C4534j extends C2280e {
    public C4534j(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.C2280e, android.view.Menu
    public SubMenu addSubMenu(int i7, int i8, int i9, CharSequence charSequence) {
        C2282g c2282g = (C2282g) m9515a(i7, i8, i9, charSequence);
        C4536l c4536l = new C4536l(m9538w(), this, c2282g);
        c2282g.m9567x(c4536l);
        return c4536l;
    }
}
