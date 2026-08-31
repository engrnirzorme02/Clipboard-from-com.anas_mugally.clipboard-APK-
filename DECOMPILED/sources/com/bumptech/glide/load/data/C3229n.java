package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p027D1.AbstractC0183c;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.n */
/* JADX INFO: loaded from: classes.dex */
public class C3229n extends AbstractC3227l {

    /* JADX INFO: renamed from: e */
    private static final UriMatcher f13831e;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f13831e = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C3229n(ContentResolver contentResolver, Uri uri, boolean z7) {
        super(contentResolver, uri, z7);
    }

    /* JADX INFO: renamed from: j */
    private InputStream m17133j(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int iMatch = f13831e.match(uri);
        if (iMatch != 1) {
            if (iMatch == 3) {
                return m17134k(contentResolver, uri);
            }
            if (iMatch != 5) {
                return (this.f13827a && AbstractC0183c.m921d(uri) && AbstractC0183c.m920c()) ? m17135l(uri, contentResolver) : contentResolver.openInputStream(uri);
            }
        }
        Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uriLookupContact != null) {
            return m17134k(contentResolver, uriLookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* JADX INFO: renamed from: k */
    private InputStream m17134k(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    /* JADX INFO: renamed from: l */
    private InputStream m17135l(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorM925h = AbstractC0183c.m925h(uri, contentResolver);
        if (assetFileDescriptorM925h != null) {
            try {
                return assetFileDescriptorM925h.createInputStream();
            } catch (IOException e7) {
                try {
                    assetFileDescriptorM925h.close();
                } catch (Exception unused) {
                }
                throw ((FileNotFoundException) new FileNotFoundException("Unable to create stream").initCause(e7));
            }
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3219d
    /* JADX INFO: renamed from: a */
    public Class mo930a() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.AbstractC3227l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo17105c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.AbstractC3227l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public InputStream mo17106f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream inputStreamM17133j = m17133j(uri, contentResolver);
        if (inputStreamM17133j != null) {
            return inputStreamM17133j;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }
}
