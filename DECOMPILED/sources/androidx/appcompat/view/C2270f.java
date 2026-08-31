package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.collection.C2400k;
import java.util.ArrayList;
import p057H.InterfaceMenuC0491a;
import p057H.InterfaceMenuItemC0492b;
import p295m.MenuC6317d;
import p295m.MenuItemC6316c;

/* JADX INFO: renamed from: androidx.appcompat.view.f */
/* JADX INFO: loaded from: classes.dex */
public class C2270f extends ActionMode {

    /* JADX INFO: renamed from: a */
    final Context f7517a;

    /* JADX INFO: renamed from: b */
    final AbstractC2266b f7518b;

    /* JADX INFO: renamed from: androidx.appcompat.view.f$a */
    public static class a implements AbstractC2266b.a {

        /* JADX INFO: renamed from: a */
        final ActionMode.Callback f7519a;

        /* JADX INFO: renamed from: b */
        final Context f7520b;

        /* JADX INFO: renamed from: c */
        final ArrayList f7521c = new ArrayList();

        /* JADX INFO: renamed from: d */
        final C2400k f7522d = new C2400k();

        public a(Context context, ActionMode.Callback callback) {
            this.f7520b = context;
            this.f7519a = callback;
        }

        /* JADX INFO: renamed from: f */
        private Menu m9384f(Menu menu) {
            Menu menu2 = (Menu) this.f7522d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            MenuC6317d menuC6317d = new MenuC6317d(this.f7520b, (InterfaceMenuC0491a) menu);
            this.f7522d.put(menu, menuC6317d);
            return menuC6317d;
        }

        @Override // androidx.appcompat.view.AbstractC2266b.a
        /* JADX INFO: renamed from: a */
        public void mo9251a(AbstractC2266b abstractC2266b) {
            this.f7519a.onDestroyActionMode(m9385e(abstractC2266b));
        }

        @Override // androidx.appcompat.view.AbstractC2266b.a
        /* JADX INFO: renamed from: b */
        public boolean mo9252b(AbstractC2266b abstractC2266b, Menu menu) {
            return this.f7519a.onCreateActionMode(m9385e(abstractC2266b), m9384f(menu));
        }

        @Override // androidx.appcompat.view.AbstractC2266b.a
        /* JADX INFO: renamed from: c */
        public boolean mo9253c(AbstractC2266b abstractC2266b, Menu menu) {
            return this.f7519a.onPrepareActionMode(m9385e(abstractC2266b), m9384f(menu));
        }

        @Override // androidx.appcompat.view.AbstractC2266b.a
        /* JADX INFO: renamed from: d */
        public boolean mo9254d(AbstractC2266b abstractC2266b, MenuItem menuItem) {
            return this.f7519a.onActionItemClicked(m9385e(abstractC2266b), new MenuItemC6316c(this.f7520b, (InterfaceMenuItemC0492b) menuItem));
        }

        /* JADX INFO: renamed from: e */
        public ActionMode m9385e(AbstractC2266b abstractC2266b) {
            int size = this.f7521c.size();
            for (int i7 = 0; i7 < size; i7++) {
                C2270f c2270f = (C2270f) this.f7521c.get(i7);
                if (c2270f != null && c2270f.f7518b == abstractC2266b) {
                    return c2270f;
                }
            }
            C2270f c2270f2 = new C2270f(this.f7520b, abstractC2266b);
            this.f7521c.add(c2270f2);
            return c2270f2;
        }
    }

    public C2270f(Context context, AbstractC2266b abstractC2266b) {
        this.f7517a = context;
        this.f7518b = abstractC2266b;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f7518b.mo9352c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f7518b.mo9353d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC6317d(this.f7517a, (InterfaceMenuC0491a) this.f7518b.mo9354e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f7518b.mo9355f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f7518b.mo9356g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f7518b.m9373h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f7518b.mo9357i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f7518b.m9374j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f7518b.mo9358k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f7518b.mo9359l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f7518b.mo9360m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f7518b.mo9362o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f7518b.m9375p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f7518b.mo9364r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z7) {
        this.f7518b.mo9365s(z7);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i7) {
        this.f7518b.mo9361n(i7);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i7) {
        this.f7518b.mo9363q(i7);
    }
}
