package com.nader.aria.note.business.internal;

import com.nader.aria.base.business.internal.GeneralService;
import com.nader.aria.note.enitites.NoteManager;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class NoteManagerService implements GeneralService<NoteManager> {
}
