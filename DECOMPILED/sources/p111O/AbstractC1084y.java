package p111O;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.MenuItem;
import p057H.InterfaceMenuItemC0492b;

/* JADX INFO: renamed from: O.y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1084y {

    /* JADX INFO: renamed from: O.y$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static MenuItem m4799a(MenuItem menuItem, char c7, int i7) {
            return menuItem.setAlphabeticShortcut(c7, i7);
        }

        /* JADX INFO: renamed from: b */
        static MenuItem m4800b(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        /* JADX INFO: renamed from: c */
        static MenuItem m4801c(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        /* JADX INFO: renamed from: d */
        static MenuItem m4802d(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        /* JADX INFO: renamed from: e */
        static MenuItem m4803e(MenuItem menuItem, char c7, int i7) {
            return menuItem.setNumericShortcut(c7, i7);
        }

        /* JADX INFO: renamed from: f */
        static MenuItem m4804f(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: renamed from: a */
    public static MenuItem m4792a(MenuItem menuItem, AbstractC1035b abstractC1035b) {
        if (menuItem instanceof InterfaceMenuItemC0492b) {
            return ((InterfaceMenuItemC0492b) menuItem).mo2091a(abstractC1035b);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* JADX INFO: renamed from: b */
    public static void m4793b(MenuItem menuItem, char c7, int i7) {
        if (menuItem instanceof InterfaceMenuItemC0492b) {
            ((InterfaceMenuItemC0492b) menuItem).setAlphabeticShortcut(c7, i7);
        } else {
            a.m4799a(menuItem, c7, i7);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m4794c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC0492b) {
            ((InterfaceMenuItemC0492b) menuItem).setContentDescription(charSequence);
        } else {
            a.m4800b(menuItem, charSequence);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m4795d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC0492b) {
            ((InterfaceMenuItemC0492b) menuItem).setIconTintList(colorStateList);
        } else {
            a.m4801c(menuItem, colorStateList);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m4796e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC0492b) {
            ((InterfaceMenuItemC0492b) menuItem).setIconTintMode(mode);
        } else {
            a.m4802d(menuItem, mode);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m4797f(MenuItem menuItem, char c7, int i7) {
        if (menuItem instanceof InterfaceMenuItemC0492b) {
            ((InterfaceMenuItemC0492b) menuItem).setNumericShortcut(c7, i7);
        } else {
            a.m4803e(menuItem, c7, i7);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m4798g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC0492b) {
            ((InterfaceMenuItemC0492b) menuItem).setTooltipText(charSequence);
        } else {
            a.m4804f(menuItem, charSequence);
        }
    }
}
